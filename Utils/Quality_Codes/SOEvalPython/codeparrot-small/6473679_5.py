def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    list_of_lists = list_of_lists[:]
    for idx, item in enumerate(list_of_lists):
        output = None
        if len(item) == 1:
            output = item[0]
        elif len(item) == 2:
            output = list(item)
        else:
            output = (item, None)
        list_of_lists.remove(idx)
        del list_of_lists[idx]
    return list_of_lists


