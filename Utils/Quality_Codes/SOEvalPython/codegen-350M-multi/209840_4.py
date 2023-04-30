def make_dictionary(key:list, value:list) -> dict:
    '''
    Make a dictionary from two lists.
    
    Example:
    make_dictionary(['a', 'b'], [1, 2]) -> {'a': 1, 'b': 2}
    make_dictionary(['a', 'b'], [1]) -> {'a': 1}
    '''
    results = {}
    max = max(value)
    for v in value:
        results.update({v: max})
        for k, v in key.items():
            key[k] = results.get(k, max)
            results[k] += v
    return results


