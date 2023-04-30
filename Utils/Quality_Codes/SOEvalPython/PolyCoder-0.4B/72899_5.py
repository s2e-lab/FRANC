def sort_list_of_dicts(lst: list, key: str) -> list:
    '''
    Sort a list of dictionaries by a key.
    
    Example:
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'a') -> [{'a': 1}, {'a': 2}]
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'b') -> [{'a': 2}, {'a': 1}]
    '''
    if key not in lst:
        return []
    assert sort(key) in lst, 'invalid key found in list'
    if lst[sort(key)] == []:
        return lst
    return lst[sort(key)]


