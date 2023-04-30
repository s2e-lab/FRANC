def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''

    num_transposed = len(list_of_lists[0])
    # Indices start at 1.
    list_of_lists[0][0] = list_of_lists[0][0][0] + 1

    for i in xrange(num_transposed):
        list_of_lists[0][0][i] -= 1

    # Reverse of list_of_lists, sort by element length.
    #
    sorted_list_of_lists = list_of_lists[:num_transposed]
    sorted_list_of_lists.reverse()

    return sorted_