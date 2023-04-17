def split_string(string: list, separator: str) -> list:
    '''
    Split a string into a list of strings.
    
    Example:
    split_string('a-b-c', '-') -> ['a', 'b', 'c']
    split_string('abc', '') -> ['a', 'b', 'c']
    '''
    return [string.split(separator)]