import json
import re

def get_prompts(filename):
    with open(filename) as f:
        prompts = []
        for line in f:
            prompts.append(json.loads(line))
    return prompts

def write_suggestions(suggestions, filename):
    with open(filename, "w") as f:
        for suggestion in suggestions:
            f.write(json.dumps(suggestion) + "\n")

def get_method_name(code: str, language) -> str:
    pattern = ""
    if language == "python":
        pattern = r"^def\s+\w+\s*\("
    elif language == "java":
        pattern = r"^public\s+\w+\s+\w+\s*\("

    matches = re.findall(pattern, code, re.MULTILINE)
    if len(matches) > 0:
        return matches[-1]
    return ""

def get_line_number(code: str, target_line: str) -> int:
    lines = code.splitlines()
    for i in range(len(lines)):
        if target_line in lines[i]:
            return i
    return -1

def get_code_up_to_line(code: str, line_number: int) -> str:
    lines = code.splitlines()
    return "\n".join(lines[:line_number])
