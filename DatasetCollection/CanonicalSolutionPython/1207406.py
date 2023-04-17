def remove_items_from_list(list1: list, list2: list) -> list:
    '''
    Remove all items from list1 that are in list2.

    Example:
    remove_items_from_list([1, 2, 3], [2, 3, 4])
    -> [1]

    remove_items_from_list([1, 2, 3], [4, 5, 6])
    -> [1, 2, 3]
    '''
    for item in list2:
        if item in list1:
            list1.remove(item)
    return list1