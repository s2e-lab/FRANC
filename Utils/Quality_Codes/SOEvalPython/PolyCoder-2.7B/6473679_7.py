def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    n = len(list_of_lists)
    l = [ [] for _ in range(n) if not contains(list_of_lists, _) ]
    for i in range(n):
        nbr_lst = []
        for j in range(i + 1, n):
            nbr_lst.append(list_of_lists[j][i])
        l[i].append