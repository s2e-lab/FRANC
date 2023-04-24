import re
import time

from utils import get_method_name, get_line_number, get_code_up_to_line, line_of_index, remove_content_from_folder

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

    method_name = get_method_name(code, language)

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
    eof_tokens = ["\n```\n\n##", "</code>"]
    applied_heuristic = False
    for e in eof_tokens:
        index = code.index(e) if e in code else None
        if index and line_of_index(code, index) > ignore_line_before:
            code = code[:index]
            applied_heuristic = True
    return code, applied_heuristic


def heuristic_4(code, data, key, language) -> str:
    prompt = data[key]
    method_name = get_method_name(prompt, language)

    applied_heuristic = False

    last_method_in_code = get_method_name(code, language)
    if last_method_in_code == "":
        return code, applied_heuristic
    while last_method_in_code != method_name:
        code = code[: code.rindex(last_method_in_code)]
        last_method_in_code = get_method_name(code, language)
        applied_heuristic = True
        if last_method_in_code == "":
            return code, applied_heuristic

    return code, applied_heuristic


def heuristic_5(code, language) -> str:
    method_name = get_method_name(code, language)
    ignore_line_before = get_line_number(code, method_name)

    applied_heuristic = False

    matches = re.findall("\n\S", code)
    if len(matches) > 0:
        for match in matches:
            if match.strip().endswith("#"):
                continue
            
            index = code.index(match)

            if index and line_of_index(code, index) > ignore_line_before:
                code = code[:index]
                applied_heuristic = True
                break

    return code, applied_heuristic


def fix_code(dataset, model, code, data, language, key="prompt") -> str:
    # track what heuristic(s) were applied, if any
    total_heuristics = 5
    applied_heuristics = [False for _ in range(0, total_heuristics)]

    if "gpt3.5" in model:
        code, applied_heuristics[0] = heuristic_1(code)
        code, applied_heuristics[1] = heuristic_2(code, data, key, language)

    code, applied_heuristics[2] = heuristic_3(code, language)
    code, applied_heuristics[3] = heuristic_4(code, data, key, language)
    code, applied_heuristics[4] = heuristic_5(code, language)

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

    language = "java"
    if "python" in benchmark_file.lower():
        language = "python"
    print("Language: ", language)

    remove_content_from_folder("Dummy_output")

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
                    "./Dummy_output/"
                    + model_name
                    + "_"
                    + dataset_name
                    + "_"
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
