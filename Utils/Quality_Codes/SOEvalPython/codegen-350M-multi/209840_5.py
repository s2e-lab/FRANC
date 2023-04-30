def make_dictionary(key:list, value:list) -> dict:
    '''
    Make a dictionary from two lists.
    
    Example:
    make_dictionary(['a', 'b'], [1, 2]) -> {'a': 1, 'b': 2}
    make_dictionary(['a', 'b'], [1]) -> {'a': 1}
    '''
    try:
        # first key:
        # value[0..-1]: value[0..-1]
        value_first = [item for item in value if item == value[0]][0]

        # next, the value:
        # value[1..-1]
        value_second = [item for item in value if item == value[1]][0]

        # make a dictionary from those two lists:
        return dict(zip(key, value_first+value_second))
    except ValueError:
        return {}   