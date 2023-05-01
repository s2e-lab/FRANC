import json
from tqdm.auto import tqdm
from transformers import pipeline
import openai


py_model_list_small = [
    "Salesforce/codegen-350M-mono",
    "codeparrot/codeparrot-small",
    "NinedayWang/PolyCoder-160M",
    "NinedayWang/PolyCoder-0.4B",
    "Salesforce/codegen-350M-multi",
    "facebook/incoder-1B",
    "codeparrot/codeparrot",
    "Salesforce/codegen-2B-mono",
    "Salesforce/codegen-2B-multi",
    "NinedayWang/PolyCoder-2.7B",
]
py_model_list_big = ["Salesforce/codegen-6B-mono", "facebook/incoder-6B", "Salesforce/codegen-6B-multi"]

multi_model_list_small = [
    "NinedayWang/PolyCoder-160M",
    "NinedayWang/PolyCoder-0.4B",
    "Salesforce/codegen-350M-multi",
    "facebook/incoder-1B",
    "Salesforce/codegen-2B-multi",
    "NinedayWang/PolyCoder-2.7B",
]
multi_model_list_big = ["Salesforce/codegen-6B-multi", "facebook/incoder-6B"]

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

def get_model(model_name):
    for model in py_model_list_small:
        if model_name in model:
            return model
    for model in py_model_list_big:
        if model_name in model:
            return model
    for model in multi_model_list_small:
        if model_name in model:
            return model
    for model in multi_model_list_big:
        if model_name in model:
            return model
        

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




def load_config(config_file: str) -> dict:
    """
    Loads the JSON configuration and sets the OpenAI API key.
    @param config_file:  Path to the JSON configuration file.
    @returns config: dictionary of the parsed configuration
    """
    with open(config_file) as json_file:
        config = json.load(json_file)
    # sets the OpenAI key
    openai.api_key = config["OPEN_AI_KEY"]
    return config