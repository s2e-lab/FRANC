def make_dictionary(key:list, value:list) -> dict:
    '''
    Make a dictionary from two lists.
    
    Example:
    make_dictionary(['a', 'b'], [1, 2]) -> {'a': 1, 'b': 2}
    make_dictionary(['a', 'b'], [1]) -> {'a': 1}
    '''
    assert isinstance(key, list), "Argument was not a list"
    assert len(value) % 2 == 0, ""
    
    dictionary = {}
    for i in range(len(key)):
        dictionary[key[i]] = value[i]
    return dictionary

