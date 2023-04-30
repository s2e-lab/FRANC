def process_escape_sequence(string: str) -> str:
    escape_dict = {"\\n": "\n", "\\t": "\t", "\\\\": "\\"}
    for key, value in escape_dict.items():
        string = string.replace(key, value)
    return string