def make_dictionary(key:list, value:list) -> dict:
    '''
    Make a dictionary from two lists.
    
    Example:
    make_dictionary(['a', 'b'], [1, 2]) -> {'a': 1, 'b': 2}
    make_dictionary(['a', 'b'], [1]) -> {'a': 1}
    '''

    dictionary=dict({k:None for k in key})
    for key in value:
        dictionary[key] = value[key]
    return dictionary
  
