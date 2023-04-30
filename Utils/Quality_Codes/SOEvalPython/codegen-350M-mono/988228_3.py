import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    if type(string) == list:
        string = string[0]
    d = dict()
    i = 0
    while i < len(string):
        j = i + 1
        data = str(string[i:j])
        try:
            d[data] = eval(data)
        except:
            d[data] = None
        i = j
    return d
