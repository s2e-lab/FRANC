import json
def convert_string_to_dictionary(string: str) -> dict:
    '''
    Convert string to dictionary
    
    Example:
    convert_string_to_dictionary('{"a": 1, "b": 2}') -> {'a': 1, 'b': 2}
    convert_string_to_dictionary('{"a": 2, "b": 3}') -> {'a': 2, 'b': 3}
    '''

    dictionary_to_return = {}

    #Remove the '\"' at the end of string
    string = string.strip('\"')

    #Split the string into a list
    list_of_keyvalue_elements = string.split(', ')

    #Remove empty strings in the list
    list_of_keyvalue_elements = list(filter(None, list_of_keyvalue_elements))

    #Convert the list back to strings with ':' between
    for i, element in enumerate(list_of_keyvalue