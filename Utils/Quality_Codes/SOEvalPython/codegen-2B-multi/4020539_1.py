def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a
    b'
    process_escape_sequence('a\\tb') -> 'a       b'
    '''
    result = ''
    i = 0
    while i < len(string):
        code = string[i]
        if len(string) - i == 0:
            break
        if code == 'a':
            code = '0'
        elif code == 'b':
            code = '10'
        elif code == 'c':
            code = '13'
        elif code == 'd':
            code = '1337'
        char = unichr(int(code, 16))
        result += char
        i