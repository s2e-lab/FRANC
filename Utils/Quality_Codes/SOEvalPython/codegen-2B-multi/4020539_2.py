def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    
    regex = re.compile('\\\\(.)')
    for match in regex.finditer(string):
        string = string.replace(match.group(1), match.group(1).lower(), 1)
    return string

