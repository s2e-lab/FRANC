import os

from utils import get_prompts, write_suggestions, get_model, get_generator, generate_suggestions
import torch



benchmark_root = "../Repair_Benchmarks/"
dir_list = os.listdir(benchmark_root)

suggestion_root = "./Repair_Suggestions/"

not_include = []
for benchmark_file in dir_list:
    if "CoderEval4Java" in benchmark_file:
        print("Processing file: ", benchmark_file)
        benchmark_path = os.path.join(benchmark_root, benchmark_file)
        prompts = get_prompts(benchmark_path)
        print("Number of prompts: ", len(prompts))

        max_new_length = 128
        num_suggestions = 10

        dataset_type = "Java"
        if "python" in benchmark_file.lower():
            dataset_type = "Python"
        else:
            dataset_type = "Java"

        print("Dataset type: ", dataset_type)
        
        if 'SOEval' in benchmark_file:
            model = benchmark_file.split('_')[1]
        else:
            model = benchmark_file.split('_')[2]
        
        if "gpt3.5" in model:
            continue
        
        model = get_model(model)
        print("Model: ", model)

        torch.cuda.empty_cache()

        suggestion_path = suggestion_root + benchmark_file

        try:
            generator = get_generator(model)
        except:
            print("Error with model: ", model)
        suggestions = generate_suggestions(
            generator,
            prompts,
            key="repair_prompt",
            max_new_length=max_new_length,
            num_suggestions=num_suggestions,
        )
        write_suggestions(suggestions, suggestion_path)