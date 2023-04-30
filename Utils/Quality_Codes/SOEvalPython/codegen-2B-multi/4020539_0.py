def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    
    if not string:
        return string
    
    processed = ''
    index = 0
    for character in string:
        
        character = _translate_escape_sequence(character)
        if character is not None:
            processed += character
        
        index += 1
    
    return processed
