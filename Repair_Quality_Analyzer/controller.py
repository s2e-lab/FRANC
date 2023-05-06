import os

from utils import get_prompts, write_suggestions

from analyzer import analyzer

benchmark_root = "../Repair_Static_Filter/Repair_Static_Filtered_Suggestions/"
dir_list = os.listdir(benchmark_root)

not_include = []
for benchmark_file in dir_list:
    if ".DS_Store" not in benchmark_file:
        print("Processing file: ", benchmark_file)
        benchmark_path = os.path.join(benchmark_root, benchmark_file)
        prompts = get_prompts(benchmark_path)
        print("Number of prompts: ", len(prompts))

        max_new_length = 128
        num_suggestions = 10

        dataset_type = "Java"
        if "python" in benchmark_file.lower():
            dataset_type = "Python"
            continue
        else:
            dataset_type = "Java"
            
        print("Dataset type: ", dataset_type)

        suggestion_root = "./Repair_Quality_Filtered_Suggestions/"
        suggestion_path = os.path.join(suggestion_root, benchmark_file)
        suggestions = []
        suggestions = analyzer(
                benchmark_file,
                prompts,
                key="prompt",
                max_new_length=max_new_length,
                num_suggestions=num_suggestions,
            )
            # suggestions = java_analyzer()
        write_suggestions(suggestions, suggestion_path)
