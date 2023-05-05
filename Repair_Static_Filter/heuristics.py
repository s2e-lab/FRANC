import re
import time
from tqdm.auto import tqdm

from utils import (
    get_method_name,
    get_line_number,
    get_code_up_to_line,
    line_of_index,
    remove_content_from_folder,
    get_class_name,
    get_all_class_names,
    parse_code,
    get_line_number_repair,
    remove_code_upto_line,
)

DEBUG = False


def heuristic_1(code: str, language: str):
    """
    Captures the code between the triple backticks.
    @param code: generated code.
    @return: code between the triple backticks
    """
    applied_heuristic = False
    pattern = ""
    if language == "python":
        pattern = r"[\S\s.]*?\`\`\`(?:[\S\s.]*?python\n)?([\S\s.]*?)\`\`\`[\S\s.]*?"
    else:
        pattern = r"[\S\s.]*?\`\`\`(?:[\S\s.]*?java\n)?([\S\s.]*?)\`\`\`[\S\s.]*?"
    good_code = re.findall(pattern, code, re.DOTALL)
    if len(good_code) > 0:
        code = good_code[0].strip()
        applied_heuristic = True
    return code, applied_heuristic


def heuristic_2(code, data, key, language):
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
        code = prompt + "\n\t" + code
        heuristic_applied = True
    return code, heuristic_applied


def heuristic_3(code, language):
    method_name = get_method_name(code, language)

    ignore_line_before = 0
    if method_name in code:
        ignore_line_before = get_line_number(code, method_name)

    # removes the extra code
    eof_tokens = ["\n```\n\n##", "\n</code>"]
    applied_heuristic = False
    for e in eof_tokens:
        index = code.index(e) if e in code else None
        if index and line_of_index(code, index) > ignore_line_before:
            code = code[:index]
            applied_heuristic = True
    return code, applied_heuristic


def heuristic_4(code, data, key, language):
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


def heuristic_5(code, language):
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


def heuristic_6(code: str, data, key, language):
    prompt = data[key]
    class_name = get_class_name(prompt, language)
    applied_heuristic = False

    all_class_names = get_all_class_names(code, language)
    for name in all_class_names:
        if class_name not in name:
            line_no = get_line_number(code, name)
            if line_no != -1:
                code = "\n".join(code.splitlines()[:line_no])
                applied_heuristic = True
                break
    return code, applied_heuristic


def heuristic_7(code: str, data, key):
    """
    Fixes 'incomplete statements' type of compilation errors.
    Try to fix incomplete code by iteratively deleting lines and adding curly brackets.
    @param code: generated code.
    @return: the code that replaces the large integer by Integer.parseInt(n) (if needed),
    and one boolean to indicate whether the heuristic was applied: (code, applied_heuristic).
    """
    # if the code is valid, return it
    cu = parse_code(code)
    if cu:
        return code, False
    # otherwise, try to fix it
    prompt = data[key]
    prompt_lines = prompt.count("\n")
    new_code = code
    num_lines = new_code.count("\n")
    # test prompt is length of 10, so we try to fix the code by removing lines until we reach 10
    while num_lines > prompt_lines:
        # append two curly brackets
        cu = parse_code(new_code + "\n}\n}")
        if cu:
            return new_code + "\n}\n}", True

        # append one curly bracket
        cu = parse_code(new_code + "\n}")
        if cu:
            return new_code + "\n}", True

        # remove the last line
        new_code = new_code[: new_code.rfind("\n")]
        num_lines -= 1

        # append two curly brackets
        cu = parse_code(new_code + "\n\t}\n}")
        if cu:
            return new_code + "\n}\n}", True
        # append one curly bracket
        cu = parse_code(new_code + "\n}")
        if cu:
            return new_code + "\n}", True

    # if we reach here, the code is still unfixable
    return code, False


def replace_code(code, data):
    # print("Fix in prompt: ", get_line_number_repair(data["repair_prompt"], " Fix: "))
    # print("Fix in code: ", get_line_number_repair(code, " Fix: "))
    code = remove_code_upto_line(
        code, get_line_number_repair(data["repair_prompt"], " Fix: ")
    )
    return code


def replace_code_gpt3(code, data, language):
    old_code = code
    if language == "python":
        methodname = get_method_name(data["repair_prompt"], language)
        # print("Method name: ", methodname)
        if methodname not in code:
            if "prompt" in data.keys():
                code = data["prompt"] +"\n"+ code
            else:
                code = data["Prompt"] +"\n"+ code

    else:
        classname = get_class_name(data["repair_prompt"], language)
        if classname not in code:
            if "prompt" in data.keys():
                code = data["prompt"] + code
            else:
                code = data["Prompt"] + code
    return code, old_code!=code


def fix_code(dataset, model, code, data, language, key="prompt"):
        
    


    # track what heuristic(s) were applied, if any
    total_heuristics = 7
    applied_heuristics = [False for _ in range(0, total_heuristics)]
    if "gpt3.5" in model:
        code, applied_heuristics[0] = heuristic_1(code, language)
        code, applied_heuristics[1] = replace_code_gpt3(code, data, language)
    #     # code, applied_heuristics[1] = heuristic_2(code, data, key, language)
    # code = replace_code(code, data)

    code, applied_heuristics[2] = heuristic_3(code, language)

    if language == "python":
        code, applied_heuristics[3] = heuristic_4(code, data, key, language)
        code, applied_heuristics[4] = heuristic_5(code, language)
    else:
        code, applied_heuristics[5] = heuristic_6(code, data, key, language)
        code, applied_heuristics[6] = heuristic_7(code, data, key)

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
    if DEBUG:
        print("Language: ", language)

    remove_content_from_folder("Dummy_output")

    fixed_suggestions = []
    for prompt in tqdm(prompts):
        if DEBUG:
            print("Processing prompt: ", prompt["task_id"])
        updated_prompt = prompt.copy()
        assert "suggestions" in updated_prompt

        suggestions = updated_prompt["suggestions"]
        if len(suggestions) != num_suggestions:
            print("Warning: number of suggestions is not equal to num_suggestions")

        for i in range(len(suggestions)):
            if DEBUG:
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

            if DEBUG:
                print("Applied heuristics: ", applied_heuristics)

            if DEBUG:
                with open(
                    "./Dummy_output/"
                    + model_name
                    + "_"
                    + dataset_name
                    + "_"
                    + str(prompt["task_id"]).replace("/", "_")
                    + "_"
                    + str(i)
                    + ".py",
                    "w",
                ) as f:
                    f.write(fixed_code)

        updated_prompt["suggestions"] = suggestions
        fixed_suggestions.append(updated_prompt)
    print("Done processing")
    return fixed_suggestions
