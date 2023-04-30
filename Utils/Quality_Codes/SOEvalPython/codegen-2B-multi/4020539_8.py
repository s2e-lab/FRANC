def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    escaped: str = ''
    offset: str = 0
    match: str = re.match(r'''"|\\|"|\\\\|[^"^\\]''', string)
    while match:
        escaped = escaped + string[offset:match.end(0)]
        offset = match.end(0)
        escape: str = match.group(0)
        if escape == '\\':
            escaped = escaped + '\\'
        elif escape == '"':
            escaped = escaped + '"'
        