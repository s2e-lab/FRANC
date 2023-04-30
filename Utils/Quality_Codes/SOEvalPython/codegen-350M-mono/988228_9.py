import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    '''dictionary = {}'''
    dictionary = {}
    for line in string.values():
        key_vals = line.split('/')[0].split(',')
        val = line.split('/')[1].strip()
        for i in range(len(key_vals)):
            key = key_vals[i]
            val = val.split(',')[i]
            dictionary[key] = val
    
    return dictionary
    