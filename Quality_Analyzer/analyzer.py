import json
import subprocess
import time

DEBUG = False

def check_vulnerable(code):
    file = open('temp.py', 'w')
    file.write(code)
    file.close()
    result = subprocess.run(["sh", "script.sh"], stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    if result!=None:
        with open('temp.json', 'r') as f:
            data = json.load(f)
            return data['results']

def java_analyzer(code: str, prompt: str) -> str:
    """
    Analyzes the code and returns the suggestion
    """
    pass

def python_analyzer(benchmark_file, prompts, key, max_new_length, num_suggestions):
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
    for prompt in prompts:

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
            start_time = time.time()
            result = check_vulnerable(code)
            suggestion['Is_Vulnerable'] = (len(result)!=0)
            suggestion['Analyzer_Result'] = result
            

            end_time = time.time()
            
            suggestion["time_taken_quality_filter"] = end_time - start_time
            suggestions[i] = suggestion



        updated_prompt["suggestions"] = suggestions
        fixed_suggestions.append(updated_prompt)
    print("Done processing")
    return fixed_suggestions
    