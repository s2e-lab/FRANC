def sort_list_of_dicts(lst: list, key: str) -> list:
    '''
    Sort a list of dictionaries by a key.
    
    Example:
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'a') -> [{'a': 1}, {'a': 2}]
    sort_list_of_dicts([{'a': 2}, {'a': 1}], 'b') -> [{'a': 2}, {'a': 1}]
    '''
    def _merge(a: dict) -> dict:
        return a[key].copy()
    
    a = _merge(lst)
    
    
    def _resort(asorted_list: list) -> list:
        resorted_list.sort(key=key)
        return sorted(asorted_list, key=lambda x: {key: x[0]})
    
