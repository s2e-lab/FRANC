import re
import time

from utils import get_method_name, get_line_number, get_code_up_to_line

DEBUG = False


def heuristic_1(code: str) -> tuple[str, bool]:
    """
    Captures the code between the triple backticks.
    @param code: generated code.
    @return: code between the triple backticks
    """
    applied_heuristic = False
    pattern = r"[\S\s.]*?\`\`\`(?:[\S\s.]*?python\n)?([\S\s.]*?)\`\`\`[\S\s.]*?"
    good_code = re.findall(pattern, code, re.DOTALL)
    if len(good_code) > 0:
        code = good_code[0].strip()
        applied_heuristic = True
    return code, applied_heuristic


def heuristic_2(code, data, key, language) -> str:
    # Combine the code with the prompt

    heuristic_applied = False
    prompt = data[key]

    method_name = get_method_name(code,language)

    """
    There can be partial code from the prompt in the generated code.
    If we find the method name in the generated code, we check if it is in the prompt.
    If it is, we add the code from the prompt up to the method name to the generated code.
    Otherwise, we add the prompt to the generated code.
    """
    if len(method_name) > 0:
        if method_name in code:
            method_line_number_in_prompt = get_line_number(prompt, method_name)
            method_line_number_in_code = get_line_number(code, method_name)
            # print("Method line number in prompt: ", method_line_number_in_prompt)
            # print("Method line number in code: ", method_line_number_in_code)

            if method_line_number_in_prompt != -1:
                if (
                    method_line_number_in_code == 0
                    and method_line_number_in_prompt != 0
                ):
                    extra_code = get_code_up_to_line(
                        prompt, method_line_number_in_prompt
                    )
                    code = extra_code + "\n" + code
                    heuristic_applied = True
    else:
        code = prompt + "\t" + code
        heuristic_applied = True
    return code, heuristic_applied


def heuristic_3(code, language) -> str:
    method_name = get_method_name(code, language)

    ignore_line_before = 0
    if method_name in code:
        ignore_line_before = get_line_number(code, method_name)

    # removes the extra code
    eof_tokens = ["\n```\n\n##", "</code>", "print("]
    applied_heuristic = False
    for e in eof_tokens:
        index = code.index(e) if e in code else None
        if index and index > ignore_line_before:
            code = code[:index]
            applied_heuristic = True
    return code, applied_heuristic


def fix_code(dataset, model, code, data, language, key="prompt") -> str:
    # track what heuristic(s) were applied, if any
    total_heuristics = 3
    applied_heuristics = [False for _ in range(0, total_heuristics)]

    if "gpt3.5" in model:
        code, applied_heuristics[0] = heuristic_1(code)
        code, applied_heuristics[1] = heuristic_2(code, data, key, language)

    code, applied_heuristics[2] = heuristic_3(code, language)

    applied_heuristics = [
        f"H{i + 1}" for i in range(0, total_heuristics) if applied_heuristics[i]
    ]

    return code, applied_heuristics


def apply_heuristics(benchmark_file, prompts, key, max_new_length, num_suggestions):
    dataset_name = benchmark_file.split("_")[0:2]
    dataset_name = "_".join(dataset_name)
    model_name = benchmark_file.split("_")[2]
    print("Dataset: ", dataset_name)
    print("Model: ", model_name)

    language = "Java"
    if'python' in benchmark_file.lower():
        language = "Python"
    print("Language: ", language)

    fixed_suggestions = []
    for prompt in prompts:
        print("Processing prompt: ", prompt["task_id"])
        updated_prompt = prompt.copy()
        assert "suggestions" in updated_prompt

        suggestions = updated_prompt["suggestions"]
        if len(suggestions) != num_suggestions:
            print("Warning: number of suggestions is not equal to num_suggestions")

        for i in range(len(suggestions)):
            print("Processing suggestion: ", i)

            suggestion = suggestions[i]
            code = suggestion["generated_text"]
            start_time = time.time()
            fixed_code, applied_heuristics = fix_code(
                dataset_name, model_name, code, updated_prompt, language, key=key
            )
            end_time = time.time()
            suggestion["applied_heuristics"] = applied_heuristics
            suggestion["fixed_generated_text"] = fixed_code
            suggestion["time_taken_static_filter"] = end_time - start_time
            suggestions[i] = suggestion
            print("Applied heuristics: ", applied_heuristics)
            
            if DEBUG:
                with open(
                    "./Dummy_output/"+model_name+"_"+dataset_name+"_"
                    + prompt["task_id"].replace("/", "_")
                    + "_"
                    + str(i)
                    + ".py",
                    "w",
                ) as f:
                    f.write(fixed_code)

        updated_prompt["suggestions"] = suggestions
        fixed_suggestions.append(updated_prompt)
    return fixed_suggestions
