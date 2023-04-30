def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    trans_list_of_lists = []
    for i, list in enumerate(list_of_lists):
        trans_list_of_lists.append([list_of_lists[i][0], list_of_lists[i][1]])

    return trans_list_of_lists

