import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''
    d_dict = {}
    for word in string.split(','):
        word_split = word.split(':')
        if d_dict == {}:
            d_dict['word']=word_split[0]
            d_dict['type'] = word_split[1]
            d_dict['size'] = 0
            
        elif word_split[0] in d_dict.keys():
            if word_split[1].isnumeric():
                d_dict[word_split[0]]=int(word_