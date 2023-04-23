

def apply_heuristics(prompts, key, max_new_length, num_suggestions):
    suggestions = []
    for prompt in prompts:
        prompt_text = prompt[key]
        suggestion = {
            "prompt": prompt_text,
            "suggestions": [],
        }
        for i in range(num_suggestions):
            suggestion["suggestions"].append(
                {
                    "suggestion": prompt_text,
                    "score": 0,
                }
            )
        suggestions.append(suggestion)
    return suggestions