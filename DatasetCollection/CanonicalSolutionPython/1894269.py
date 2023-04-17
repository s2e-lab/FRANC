def list_string_to_list(list_string: str) -> list:
    '''
    Convert a string representation of a list to a list.

    Example:
        list_string_to_list('[1, 2, 3]') -> [1, 2, 3]
    '''
    return [int(x) for x in list_string[1:-1].split(', ')]