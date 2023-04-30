import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    _dic = {}
    for i in string:
        i_split = i.split('(')
        if _dic.has_key(i_split[0]) == False:
            _dic[i_split[0]] = i_split[1]
        else:
            _dic[i_split[0]] = "%s%s" %(i_split[0], i_split[1])
    return _dic if _dic!= {} else None

