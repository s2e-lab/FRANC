def make_dictionary(key:list, value:list) -> dict:
    '''
    Make a dictionary from two lists.
    
    Example:
    make_dictionary(['a', 'b'], [1, 2]) -> {'a': 1, 'b': 2}
    make_dictionary(['a', 'b'], [1]) -> {'a': 1}
    '''
    tmp = defaultdict(dict)
    for ele in key:
        tmp[ele] = value.get(ele, default)
    return tmp
    


### Test
