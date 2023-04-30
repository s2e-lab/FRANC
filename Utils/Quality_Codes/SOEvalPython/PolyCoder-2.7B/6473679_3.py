def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''

    # 1. sort in ascending
    if list_of_lists is not None:
        list_of_lists = sorted(list_of_lists, key=lambda x: (
            x[0].item().lower() if x[0].item().lower()!= '' else ''))

    new_list_of_lists = []
    for i, j in enumerate(list_of_lists):
        new_