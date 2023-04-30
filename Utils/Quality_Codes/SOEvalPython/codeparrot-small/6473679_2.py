def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    assert len(list_of_lists) == len(list_of_lists[0][0]), list_of_lists
    assert len(list_of_lists) == len(list_of_lists[1][0]), list_of_lists
    assert len(list_of_lists) == len(list_of_lists[2][0]), list_of_lists
    result = [[x[:] for x in l] for l in list_of_lists]
    for i in range(1, len(list_of_lists)):
        result[i][i][i