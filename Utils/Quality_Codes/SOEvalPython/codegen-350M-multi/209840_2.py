def make_dictionary(key:list, value:list) -> dict:
    '''
    Make a dictionary from two lists.
    
    Example:
    make_dictionary(['a', 'b'], [1, 2]) -> {'a': 1, 'b': 2}
    make_dictionary(['a', 'b'], [1]) -> {'a': 1}
    '''

    result = {}

    if len(key) == 1:
        for i in value:
            result[i] = key.pop(0)

    else:
        for i in value:
            index = 0
            c = key.index(i)
            try:
                index = key == i
                c = key.pop(c)
            except ValueError:
                pass

            try:
                result[index]: result[i] = value[c]
            except ValueError:
                pass

    return result
