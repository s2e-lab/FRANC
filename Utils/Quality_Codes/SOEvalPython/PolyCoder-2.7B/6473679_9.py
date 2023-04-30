def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    tmps = [] # used to create list of lists
    for ls in list_of_lists:
        if type(ls) is list: # assume this is a datastructure
            # the first dimension is the actual list
            if len(ls[0]) == 1:
                if not isinstance(ls[0], list): 
        