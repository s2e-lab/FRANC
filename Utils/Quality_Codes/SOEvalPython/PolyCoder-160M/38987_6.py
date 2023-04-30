def merge_dictionary(dict1, dict2):
    '''
    Merge two dictionaries into one.
    
    Example:
    merge_dictionary({'a': 1, 'b': 2}, {'c': 3, 'd': 4}) -> {'a': 1, 'b': 2, 'c': 3, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'd': 4}) -> {'a': 3, 'b': 2, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'b': 4}) -> {'a': 3, 'b': 4}
    '''
    d1 = dict1[0]
    d2 = dict2[2]
    merge_dictionary(d1, d2)
    d1 = dict2[0]
    d2 = dict1[10]
    merge_dictionary(d1, d2)
    d1 = dict1[0]
    d2 = dict2[8]
    merge_dictionary(d1, d2)
    d1 = dict2[12]
 