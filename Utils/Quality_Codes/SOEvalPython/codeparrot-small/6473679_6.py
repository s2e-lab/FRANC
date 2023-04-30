def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    for row in list_of_lists:
        for col in row:
            assert type(col) is list, 'row and column must be a list: {0}'.format(str(row))
            yield col

