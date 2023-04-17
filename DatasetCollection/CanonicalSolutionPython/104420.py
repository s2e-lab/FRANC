
def permutations(lst: list) -> list:
    '''
    Returns a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    if len(lst) == 0:
        return []
    elif len(lst) == 1:
        return [lst]
    else:
        l = []
        for i in range(len(lst)):
            m = lst[i]
            remLst = lst[:i] + lst[i+1:]
            for p in permutations(remLst):
                l.append([m] + p)
        return l