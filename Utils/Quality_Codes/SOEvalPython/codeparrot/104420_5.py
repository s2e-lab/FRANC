def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    # copy before returning the list...
    list_copy = []
    for item in lst:
        list_copy.append(list(item))
    # get all permutations
    return [x for sublist in list_copy for x in lst]


