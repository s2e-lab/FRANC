def deep_copy_list(list_to_copy: list) -> list:
    '''
    Returns a deep copy of the list passed in. For instance:
    a = [1, 2, 3]
    b = deep_copy_list(a)
    c = id(a) != id(b) # c is true

    Example:
    deep_copy_list([1, 2, 3])
    -> [1, 2, 3]
    '''
