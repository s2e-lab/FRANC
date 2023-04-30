def sort_list_of_dicts(lst: list, key: str) -> list:
    '''
    Sort a list of dictionaries by a key.
    
    Example:
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'a') -> [{'a': 1}, {'a': 2}]
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'b') -> [{'a': 2}, {'a': 1}]
    '''
    items = []

    for index, dict in enumerate(lst):
        item = dict[key] if key == key else list.pop(index)
        subitems = item.iteritems()
        if subitems:
            new_lst = []
            for subitem in subitems:
                new_