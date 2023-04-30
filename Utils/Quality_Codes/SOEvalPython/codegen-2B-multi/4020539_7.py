def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    if string[0]!= '\\':
        return string
    escaped: str = string[1:]  # Remove backslash and leading quote.
    chars: str = []
    if escaped[-1]!= ';':  # Escape sequences must end with semicolon
        # Not an escape sequence, treat as normal text.
        chars.append(escaped)
        return ''.join(chars)
    escaped = escaped[:-1]  # Remove trailing semicolon.
    if escaped == '':  # Handle case