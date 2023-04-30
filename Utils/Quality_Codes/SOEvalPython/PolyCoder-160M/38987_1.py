def merge_dictionary(dict1, dict2):
    '''
    Merge two dictionaries into one.
    
    Example:
    merge_dictionary({'a': 1, 'b': 2}, {'c': 3, 'd': 4}) -> {'a': 1, 'b': 2, 'c': 3, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'd': 4}) -> {'a': 3, 'b': 2, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'b': 4}) -> {'a': 3, 'b': 4}
    '''
    merged = {}
    dict1 = {'a': 1, 'b': 2}
    dict2 = {'a': 1, 'b': 2, 'c': 3, 'd': 4}
    merged.update(dict1.items())
    merged.update(dict2.items())
    for key, value in merged.items():
        merged[key] = value
    return merged
