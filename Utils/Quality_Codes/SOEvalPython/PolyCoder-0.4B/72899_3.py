def sort_list_of_dicts(lst: list, key: str) -> list:
    '''
    Sort a list of dictionaries by a key.
    
    Example:
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'a') -> [{'a': 1}, {'a': 2}]
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'b') -> [{'a': 2}, {'a': 1}]
    '''
    # we should have a simple comparator for this
    if len(lst) == 1 and isinstance(key, str) and key in lst[0]:
        return list(lst[0][key][0].items())

    return list(sort_dicts_and_keys(lst, key))

