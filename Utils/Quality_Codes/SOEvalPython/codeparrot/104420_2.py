def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    ans = []
    m = len(lst) - 1
    for i, num in enumerate(lst):
        ans.append(m // i)
        m = i * i + 1
    return ans


