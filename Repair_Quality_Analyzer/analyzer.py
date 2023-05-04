import json
import subprocess
import time
import xmltodict
from tqdm.auto import tqdm

DEBUG = False

TEMP_PYTHON_FILE = "./Temp_Python_Folder/temp.py"
TEMP_PYTHON_JSON_FILE = "./Temp_Python_Folder/temp.json"

TEMP_JAVA_FILE = "./Temp_Java_Folder/temp.java"
TEMP_JAVA_ERROR_FILE = "./Temp_Java_Folder/error.txt"
TEMP_JAVA_SPOTBUGS_FILE = "./Temp_Java_Folder/spotbugs.xml"


def python_analyzer(code):
    file = open(TEMP_PYTHON_FILE, "w")
    file.write(code)
    file.close()
    result = subprocess.run(
        ["sh", "bandit_script.sh"],
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        text=True,
    )
    if result != None:
        with open(TEMP_PYTHON_JSON_FILE, "r") as f:
            data = json.load(f)
            return data["errors"], data["results"]


def java_analyzer(code):
    """
    Analyzes the code and returns the suggestion
    """
    file = open(TEMP_JAVA_FILE, "w")
    file.write(code)
    file.close()
    return_data = subprocess.run(
        ["sh", "spotbugs_script.sh"],
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        text=True,
    )
    if return_data != None:
        error = ""
        result = ""
        with open(TEMP_JAVA_ERROR_FILE, "r") as f:
            error = f.read()
        if len(error) == 0:
            with open(TEMP_JAVA_SPOTBUGS_FILE, "r") as f:
                try:
                    result = xmltodict.parse(f.read())
                except Exception as e:
                    print("Error in parsing xml file: ", e)
                    error = "Error in parsing spotbugs.xml file possible reason: no class created because of empty file"
        return error, result


def analyzer(benchmark_file, prompts, key, max_new_length, num_suggestions):
    """
    Analyzes the code and returns the suggestion
    """
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
            code = suggestion["fixed_generated_text"]
            error = ""
            result = ""
            start_time = time.time()
            if language == "python":
                error, result = python_analyzer(code)
                suggestion["Is_Vulnerable"] = len(result) != 0
            else:
                error, result = java_analyzer(code)
                suggestion["Is_Vulnerable"] = False
                if result != "":
                    if "BugCollection" in result:
                        if "BugInstance" in result["BugCollection"]:
                            suggestion["Is_Vulnerable"] = True
            
            suggestion["Analyzer_Result"] = result

            suggestion["Is_Compilable"] = len(error) == 0
            suggestion["Error"] = error

            # print("Is_Compilable: ", suggestion["Is_Compilable"])
            # print("Is_Vulnerable: ", suggestion["Is_Vulnerable"])

            end_time = time.time()

            suggestion["time_taken_quality_filter"] = end_time - start_time
            suggestions[i] = suggestion

        updated_prompt["suggestions"] = suggestions
        fixed_suggestions.append(updated_prompt)
    print("Done processing")
    return fixed_suggestions
