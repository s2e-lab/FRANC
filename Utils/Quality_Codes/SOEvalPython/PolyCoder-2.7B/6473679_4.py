def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    assert list_of_lists, 'List of lists cannot be empty.'
    num_cols = len(list_of_lists)
    out_list = []
    for i in range(0, num_cols):
        out_list.append(list_of_lists[i].transpose().tolist())
    return out_list

