def concatenate_list_of_strings(list_of_strings:list, separator:str) -> str:
    '''
    Concatenate a list of strings with a separator.
    
    Example:
    concatenate_list_of_strings(['a', 'b', 'c'], '-') -> 'a-b-c'
    concatenate_list_of_strings(['a', 'b', 'c'], '') -> 'abc'
    '''
    return separator.join(list_of_strings)