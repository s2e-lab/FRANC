import json

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