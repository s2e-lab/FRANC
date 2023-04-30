def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    res = []
    for i in range(1, len(lst)):
        res.append(lst[:i])
    return res


#
# Given two arrays A:
# (i, j, k)
# A is a permutation over A such that any subset of B can start at indices i and j,
# and A[i].num_items() is k.
#
# Return a list of all permutations of B (sorted in descending order).
# Side Effect: Given a list A, sort the list in ascending order but reorder its elements.
#
#