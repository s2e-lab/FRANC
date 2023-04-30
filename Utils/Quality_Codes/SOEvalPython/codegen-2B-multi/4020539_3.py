def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    result = ''
    index = 0
    while index < len(string):
        index0 = index
        index = string.find('\\', index)
        if index <= start_index or index > end_index:
            return string[index0:len(string)]
        
        if index!= end_index:
            # Escaping character
            index += 1
            if string[index] == 'a':
                # Single quote is a newline
                result += '\n'
            elif string[index] == 'b':
                