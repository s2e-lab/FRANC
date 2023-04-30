import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    dictionary = {}
    for i in string:
        if i in dictionary.keys():
            dictionary[i] += 1
        elif i not in dictionary and i.isalnum():
            dictionary[i] = 1
    return dictionary


