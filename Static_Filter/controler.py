import os

from utils import (
    get_prompts,
    write_suggestions
)

from heuristics import (
    apply_heuristics
)

benchmark_root = "../SuggestionGenerator/Suggestions/"
dir_list = os.listdir(benchmark_root)

for benchmark_file in dir_list:
    if benchmark_file.startswith("HumanEval_python") and '.DS_Store' not in benchmark_file:
        print("Processing file: ", benchmark_file)
        benchmark_path = benchmark_root + benchmark_file
        prompts = get_prompts(benchmark_path)
        print("Number of prompts: ", len(prompts))

        max_new_length = 128
        num_suggestions = 10

        dataset_type = "Python"
        suggestion_root = "./Static_Filtered_Suggestions/   "
        suggestion_path = suggestion_root + benchmark_file

            
        suggestions = apply_heuristics(
                benchmark_file,
                prompts,
                key="prompt",
                max_new_length=max_new_length,
                num_suggestions=num_suggestions,
            )
        write_suggestions(suggestions, suggestion_path)

