import os

from utils import get_prompts, write_suggestions, get_model
import openai
from tqdm.auto import tqdm
import time

import json

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


# Code Generation Configuration Parameters
OPENAI_MODEL = "gpt-3.5-turbo"
OPENAI_TEMPERATURE = 0
OPENAI_TOP_P = 1
OPENAI_FREQUENCY_PENALTY = 0
OPENAI_PRESENCE_PENALTY = 0


def generate_code(prompt, max_tokens):
    """
    Returns a response object from OpenAI enriched with the prompt metadata.
    @param max_tokens: what is the token size limit used
    @param is_fix: True if we are generating code for a previous prompt that had an error
    @param prompt: the prompt object
    """
    response = openai.ChatCompletion.create(
        model=OPENAI_MODEL,
        messages=[
            {
                "role": "system",
                "content": "You are a coding assistant. You generate only source code.",
            },
            {
                "role": "user",
                "content": prompt,
            },
        ],
        temperature=OPENAI_TEMPERATURE,
        max_tokens=max_tokens,
        top_p=OPENAI_TOP_P,
        frequency_penalty=OPENAI_FREQUENCY_PENALTY,
        presence_penalty=OPENAI_PRESENCE_PENALTY,
    )
    if "choices" in response:
        if "message" in response["choices"][0]:
            if "content" in response["choices"][0]["message"]:
                return response["choices"][0]["message"]["content"]

    return ""

def generate_suggestions( prompts, key="prompt", max_new_length=128, num_suggestions=10
):
    suggestions = []
    for prompt in tqdm(prompts):
        updated_prompt = prompt.copy()
        suggestion = []
        for i in range(num_suggestions):
            try:
                suggestion.append({"generated_text": generate_code(prompt[key], max_new_length)})
            except Exception as e:
                print("Error with prompt: ", prompt["task_id"], str(e))
                suggestion.append({"generated_text": ""})
                updated_prompt["error"] = str(e)
            time.sleep(1)
        updated_prompt["suggestions"] = suggestion
        suggestions.append(updated_prompt)
    return suggestions



benchmark_root = "../Repair_Benchmarks/"
dir_list = os.listdir(benchmark_root)

suggestion_root = "./Repair_Suggestions/"

not_include = []
for benchmark_file in dir_list:
    if "gpt3.5" in benchmark_file and "aiXcoder" not in benchmark_file and "SecurityEval" not in benchmark_file:
        config = load_config("config.json")
        print("Processing file: ", benchmark_file)
        benchmark_path = os.path.join(benchmark_root, benchmark_file)
        prompts = get_prompts(benchmark_path)
        print("Number of prompts: ", len(prompts))

        max_new_length = 128
        num_suggestions = 10


        suggestion_path = suggestion_root + benchmark_file

        suggestions = generate_suggestions( prompts, key="repair_prompt", max_new_length=config["max_new_length"], num_suggestions=config["num_suggestions"])
        print(len(suggestions))

        write_suggestions(suggestions, suggestion_path)

       