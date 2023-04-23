import time
import openai
from tqdm.auto import tqdm

from utils import (
    load_config,
    get_prompts,
    write_suggestions
)

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
        max_tokens=max_tokens,
    )
    if "choices" in response:
        if "message" in response["choices"][0]:
            if "content" in response["choices"][0]["message"]:
                return response["choices"][0]["message"]["content"]

    return ""

def fix_generate_suggestions( prompts, key="prompt", max_new_length=128, num_suggestions=10
):
    suggestions = []
    for prompt in tqdm(prompts):
        updated_prompt = prompt.copy()
        if "error" in prompt:
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


def main():

    config = load_config("config.json")
    
    benchmark_root = "./Suggestions/"
    benchmark_file = "CoderEval4Python_prompt_gpt3.5_512_10.jsonl"
    benchmark_path = benchmark_root + benchmark_file
    # get list of parsed prompts from the JSON file
    prompts = get_prompts(benchmark_path)
    print(len(prompts))
    suggestions = fix_generate_suggestions( prompts, key="prompt", max_new_length=config["max_new_length"], num_suggestions=config["num_suggestions"])
    print(len(suggestions))

    suggestion_path = benchmark_path
    write_suggestions(suggestions, suggestion_path)




if __name__ == "__main__":
    main()
