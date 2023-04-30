def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    ret = []
    temp = list()
    permsize = len(lst) - 1
    while permsize > 0:
        if len(temp) + len(lst) > permsize:
            temp += lst
            perm = temp + lst[:permsize - len(lst) - permsize]
        else:
            perm += lst[:(len(lst) - permsize)]
        permsize = len(perm)
    return [temp, perm]

