def make_flat_list(list_of_lists: list) -> list:
    '''
    Returns a list containing all the items in the list of lists passed in.
    The order of the items in the returned list should be the same as the
    order of the lists in the list of lists.
    The order of the items in each list should be the same as the order of
    the items in the original list of lists.
    The returned list should not contain any nested lists.

    Example:
    make_flat_list([[1, 2], [3, 4], [5, 6]])
    -> [1, 2, 3, 4, 5, 6]

    make_flat_list([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
    -> [1, 2, 3, 4, 5, 6, 7, 8, 9]
    '''
