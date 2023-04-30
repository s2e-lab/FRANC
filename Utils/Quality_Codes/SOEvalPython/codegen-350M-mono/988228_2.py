import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    d = json.loads(string)

    for key in d.keys():
        if not isinstance(d[key], dict):
            raise TypeError(f'Each value of json must be dictionary, but received value is {type(d[key])}')
        else:
        # for all the values, convert them to dictionary
            d[key] = convert_string_to_dictionary(d[key])
    return d

