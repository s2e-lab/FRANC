import os

from utils import get_prompts, write_suggestions

from analyzer import java_analyzer, python_analyzer

benchmark_root = "../SuggestionGenerator/Suggestions/"
dir_list = os.listdir(benchmark_root)

for benchmark_file in dir_list:
    if ".DS_Store" not in benchmark_file:
        print("Processing file: ", benchmark_file)
        benchmark_path = benchmark_root + benchmark_file
        prompts = get_prompts(benchmark_path)
        print("Number of prompts: ", len(prompts))

        max_new_length = 128
        num_suggestions = 10

        dataset_type = "Python"
        suggestion_root = "./Static_Filtered_Suggestions/   "
        suggestion_path = suggestion_root + benchmark_file
        suggestions = []
        if dataset_type == "Python":
            suggestions = python_analyzer()
        elif dataset_type == "Java":
            suggestions = java_analyzer()
        write_suggestions(suggestions, suggestion_path)
