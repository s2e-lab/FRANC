def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    if isinstance(list_of_lists, list):
        out_list = []
        for element in list_of_lists:
            new_list = []
            for sub_element in element:
                new_list.append(transpose_list_of_lists(sub_element))
            out