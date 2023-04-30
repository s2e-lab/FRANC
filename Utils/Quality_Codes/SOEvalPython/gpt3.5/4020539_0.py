def process_escape_sequence(string: str) -> str:
    return string.encode('utf-8').decode('unicode_escape')