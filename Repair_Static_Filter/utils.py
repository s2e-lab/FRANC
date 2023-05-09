import json
import re
import os, shutil

import javalang
from javalang.parser import JavaSyntaxError
from javalang.tokenizer import LexerError

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

def get_line_number_repair(code: str, target_line: str) -> int:
    lines = code.splitlines()
    line_no = -1
    for i in range(len(lines)):
        if target_line in lines[i]:
            line_no = i
    return line_no

def remove_code_upto_line(code: str, target_line: int) -> int:
    lines = code.splitlines()
    for i in range(len(lines)):
        if target_line == i:
            return "\n".join(lines[i+1:])
    return code

def get_code_up_to_line(code: str, line_number: int) -> str:
    lines = code.splitlines()
    return "\n".join(lines[:line_number])


def line_of_index(code: str, index: int) -> int:
    lines = code.splitlines()
    line_number = 0
    for line in lines:
        if index < len(line):
            return line_number
        index -= len(line)
        line_number += 1
    return -1

def remove_content_from_folder(folder):
    for filename in os.listdir(folder):
        file_path = os.path.join(folder, filename)
        try:
            if os.path.isfile(file_path) or os.path.islink(file_path):
                os.unlink(file_path)
            elif os.path.isdir(file_path):
                shutil.rmtree(file_path)
        except Exception as e:
            print('Failed to delete %s. Reason: %s' % (file_path, e))


def get_class_name(code: str, language) -> str:
    pattern = ""
    if language == "python":
        pattern = r"^class\s+(\w+)\s*\("
    elif language == "java":
        pattern = r"^class\s+(\w+)\s*\{"

    matches = re.findall(pattern, code, re.MULTILINE)
    if len(matches) > 0:
        return matches[0]
    return ""

def get_all_class_names(code: str, language) -> str:
    pattern = ""
    if language == "python":
        pattern = r"^class\s+\w+\s*\("
    elif language == "java":
        pattern = r"class\s+\w+\s*\{"

    matches = re.findall(pattern, code, re.MULTILINE)
    return matches


def parse_code(code) -> bool:
    try:
        return javalang.parse.parse(code)  # code is compilable
    except (JavaSyntaxError, LexerError, TypeError, RecursionError, StopIteration) as e:
        return None