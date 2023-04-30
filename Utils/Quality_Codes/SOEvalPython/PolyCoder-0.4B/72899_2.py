def sort_list_of_dicts(lst: list, key: str) -> list:
    '''
    Sort a list of dictionaries by a key.
    
    Example:
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'a') -> [{'a': 1}, {'a': 2}]
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'b') -> [{'a': 2}, {'a': 1}]
    '''
    
    if not isinstance(lst, list):
        lst = [lst]
    
    if len(lst) == 1:
        return [x for x in lst if isinstance(x, dict)]
    
    if key not in lst:
        return lst
    
    # Get the keys associated to the key
    for key_id, dict_item in enumerate(lst):
   