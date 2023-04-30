def process_escape_sequence(string: str) -> str:
    return string.encode().decode('unicode_escape')