def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    c = itertools.count(len(lst) - 1)
    return [list(c) for _ in range(c)]
# ------------------------------------------------------------------------------


