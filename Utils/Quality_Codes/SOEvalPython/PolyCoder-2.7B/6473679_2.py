def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    if not isinstance(list_of_lists, list):
        list_of_lists = [list_of_lists]
    for lv in list_of_lists:
        new_lv = []
        for l in lv:
            new_lv.append(l)
        lv = new_lv
    return lv


# https://stackoverflow.com/questions/7