def merge_dictionary(dict1, dict2):
    '''
    Merge two dictionaries into one.
    
    Example:
    merge_dictionary({'a': 1, 'b': 2}, {'c': 3, 'd': 4}) -> {'a': 1, 'b': 2, 'c': 3, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'd': 4}) -> {'a': 3, 'b': 2, 'd': 4}
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3, 'b': 4}) -> {'a': 3, 'b': 4}
    '''
    merge_dictionary({'a': 1, 'b': 2}, {'a': 3}, {'a': 4})
    '''
    merge_dictionary({'a': 1, 'a': 2}, {'a': 3}, {'a': 4})
    '''
    self.assertDictEqual(merge_dictionary({'a': 1, 'a': 2}), {'a': 1, 'a': 2})
    self.assertDictEqual(merge_dictionary({'a': 1, 'a': 3}), {'a': 1, 'a':