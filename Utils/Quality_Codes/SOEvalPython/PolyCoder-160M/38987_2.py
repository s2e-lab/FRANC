def merge_dictionary(dict1, dict2):
    '''
    Merge two dictionaries into one.
    
    Example:
    merge_dictionary({'a': 1, 'b': 2}, {'c': 3, 'd': 4}) -> {'a': 1, 'b': 2, 'c': 3, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'd': 4}) -> {'a': 3, 'b': 2, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'b': 4}) -> {'a': 3, 'b': 4}
    '''
    return dict_from_dict_with_backw_dicts([("a", 1), ("b", 2), ("c", 3)],
                                           dict1)

#------------------------------------------------------------------------------
# A. C. D - Dictionary
#------------------------------------------------------------------------------