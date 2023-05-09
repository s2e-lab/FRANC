import os

from utils import (
    get_prompts,
    write_suggestions
)

from heuristics import (
    apply_heuristics
)

benchmark_root = "../Repair_SuggestionGenerator/Repair_Suggestions_1/"
dir_list = os.listdir(benchmark_root)

for benchmark_file in dir_list:
    if '.DS_Store' not in benchmark_file and 'gpt3.5' in benchmark_file:
        print("Processing file: ", benchmark_file)
        benchmark_path = benchmark_root + benchmark_file
        prompts = get_prompts(benchmark_path)
        print("Number of prompts: ", len(prompts))

        max_new_length = 128
        num_suggestions = 10

        dataset_type = "Python"
        suggestion_root = "./Repair_Static_Filtered_Suggestions_1/"
        suggestion_path = suggestion_root + benchmark_file

        key = "prompt"
        if "Security" in benchmark_file:
            key = "Prompt"
            
        suggestions = apply_heuristics(
                benchmark_file,
                prompts,
                key= key,
                max_new_length=max_new_length,
                num_suggestions=num_suggestions,
            )
        write_suggestions(suggestions, suggestion_path)

