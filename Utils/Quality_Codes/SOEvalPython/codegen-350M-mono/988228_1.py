import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    dict = {}
    for item in string.split('{')[1:]:
        if '=' in item:
            name, value = item.split('=')
        else:
            name = item.strip(' ')
            value = None
        dict[name] = value
    return dict

