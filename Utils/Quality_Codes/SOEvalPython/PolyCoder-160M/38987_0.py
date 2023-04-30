def merge_dictionary(dict1, dict2):
    '''
    Merge two dictionaries into one.
    
    Example:
    merge_dictionary({'a': 1, 'b': 2}, {'c': 3, 'd': 4}) -> {'a': 1, 'b': 2, 'c': 3, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'd': 4}) -> {'a': 3, 'b': 2, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'b': 4}) -> {'a': 3, 'b': 4}
    '''
    if isinstance(dict1, dictionaries):
        if isinstance(dict1, list):
            if (isinstance(dict1['a'], (dict, hash)) and isinstance(dict1['a'], dict)):
                dict1[('a', 'd')] = dict1['a'].merge_dictionary(dict1['d'])
            elif (isinstance(dict1['a'], dict)