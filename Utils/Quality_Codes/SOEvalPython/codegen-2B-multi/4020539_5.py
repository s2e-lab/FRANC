def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    if string.startswith('\\'):
        assert string.startswith('\\x')
        value = int(string[2:], 16)
        string = '\\' + ascii_char(value)
        
    elif string.startswith('\\'):
        assert string.startswith('\\r')
        string = '\\r' + string[1:]
        
    else:
        string = string[1:]
    return string

