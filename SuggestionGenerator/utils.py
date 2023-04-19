import json
import os
import openai


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