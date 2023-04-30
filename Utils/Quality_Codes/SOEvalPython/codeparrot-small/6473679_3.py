def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    def transpose(it, x):
        '''
        This function will iterate over lists and iteratively transpose the arrays.
        
        Args:
            it (list): input list to be transposed
            x (list): list of arrays to be transposed
        '''
        return list(x if isinstance(x, tuple) else [x])

    return transpose(list_of_lists)


