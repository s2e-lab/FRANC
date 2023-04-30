def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    
    new_string = string * 2
    
    m = re.search('\\\\([\\s])', string)
    
    while m:
        char = '\\' + m.group(1)
        new_string = new_string[:-1] + char + new_string[-1]
        m = re.search('\\\\([\\s])', new_string[-1])
    
    return new_string

