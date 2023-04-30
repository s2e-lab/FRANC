def process_escape_sequence(string: str) -> str:
    '''
    Process escape sequences in a string.
    
    Example:
    process_escape_sequence('a\\nb') -> 'a\nb'
    process_escape_sequence('a\\tb') -> 'a\tb'
    '''

    # define escape sequences
    ESCAPE_SEQUENCES = {'\\n': '\n', '\\t': '\t'}

    # loop through string and replace escape sequences
    for e in ESCAPE_SEQUENCES:
        string = string.replace(e, ESCAPE_SEQUENCES[e])

    return string