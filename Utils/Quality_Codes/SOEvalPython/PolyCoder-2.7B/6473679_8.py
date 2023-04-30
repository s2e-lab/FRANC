def transpose_list_of_lists(list_of_lists):
    '''
    Transpose a list of lists.
    
    Example:
    transpose_list_of_lists([[1, 2, 3], [4, 5, 6]]) -> [[1, 4], [2, 5], [3, 6]]
    transpose_list_of_lists([[1, 2], [3, 4], [5, 6]]) -> [[1, 3, 5], [2, 4, 6]]
    '''
    new_list = []
    def transpose_item(item):
        new_item = []
        for item_list in item:
            new_item += list_of_lists
            new_item += [(item_list[0], item_list[1])]
        
        return new_item
    
    for item