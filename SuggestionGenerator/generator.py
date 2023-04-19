import json
from transformers import pipeline
from tqdm.auto import tqdm


def get_prompts(filename):
    with open(filename) as f:
        prompts = []
        for line in f:
            prompts.append(json.loads(line))
    return prompts


def get_generator(model_name):
    generator = pipeline("text-generation", model=model_name, device_map="auto")
    return generator


def generate_suggestions(
    generator, prompts, key="prompt", max_new_length=128, num_suggestions=10
):
    suggestions = []
    for prompt in tqdm(prompts):
        updated_prompt = prompt.copy()
        try:
            suggestion = generator(
                prompt[key],
                max_new_tokens=max_new_length,
                num_return_sequences=num_suggestions,
                pad_token_id=generator.tokenizer.eos_token_id,
                do_sample=True
            )
        except Exception as e:
            print("Error with prompt: ", prompt["task_id"], str(e))
            suggestion = []
            updated_prompt["error"] = str(e)
        updated_prompt["suggestions"] = suggestion
        suggestions.append(updated_prompt)
    return suggestions


def write_suggestions(suggestions, filename):
    with open(filename, "w") as f:
        for suggestion in suggestions:
            f.write(json.dumps(suggestion) + "\n")


benchmark_root = "../Benchmarks/"
benchmark_file = "HumanEval_java.jsonl"
benchmark_path = benchmark_root + benchmark_file
prompts = get_prompts(benchmark_path)

max_new_length = 128
num_suggestions = 10

suggestion_root = "./Suggestions/"

py_model_list_small = [
    "Salesforce/codegen-350M-mono",
    "codeparrot/codeparrot-small",
    "codeparrot/codeparrot",
    "Salesforce/codegen-2B-mono",
]
py_model_list_big = ["Salesforce/codegen-6B-mono"]

multi_model_list_small = [
    "NinedayWang/PolyCoder-160M",
    "NinedayWang/PolyCoder-0.4B",
    "Salesforce/codegen-350M-multi",
    "codeparrot/codeparrot-small-multi",
    "facebook/incoder-1B",
    "Salesforce/codegen-2B-multi",
    "NinedayWang/PolyCoder-2.7B",
]
multi_model_list_big = ["facebook/incoder-6B", "Salesforce/codegen-6B-multi"]


# combined_model_list = py_model_list_small + multi_model_list_small + py_model_list_big + multi_model_list_big
combined_model_list = multi_model_list_small + multi_model_list_big


for model_name in combined_model_list:
    print(model_name)
    suggestion_file = (
        benchmark_file.split(".")[0]
        + "_"
        + model_name.split("/")[-1]
        + "_"
        + str(max_new_length)
        + "_"
        + str(num_suggestions)
        + ".jsonl"
    )
    suggestion_path = suggestion_root + suggestion_file

    try:
        generator = get_generator(model_name)
    except:
        print("Error with model: ", model_name)
    suggestions = generate_suggestions(
        generator,
        prompts,
        key="prompt",
        max_new_length=max_new_length,
        num_suggestions=num_suggestions,
    )
    write_suggestions(suggestions, suggestion_path)
