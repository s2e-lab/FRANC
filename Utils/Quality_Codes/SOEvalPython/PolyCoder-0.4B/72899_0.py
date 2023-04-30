def sort_list_of_dicts(lst: list, key: str) -> list:
    '''
    Sort a list of dictionaries by a key.
    
    Example:
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'a') -> [{'a': 1}, {'a': 2}]
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'b') -> [{'a': 2}, {'a': 1}]
    '''
    ret = []
    for d in lst:
        if isinstance(d, dict):
            ret.extend(sorted(list(d.items()), key=key))
            continue
        ret.append(d[key])
    return list(set(ret))
    
