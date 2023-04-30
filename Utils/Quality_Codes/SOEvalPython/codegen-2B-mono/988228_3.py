import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    string2 = string.replace('{', '').replace('}', '')
    my_dictionary = dict(x.split(':') for x in string2.split(','))
    return my_dictionary

