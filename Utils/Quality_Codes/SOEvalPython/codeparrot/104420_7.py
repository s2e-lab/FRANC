def permutations(lst: list) -> list:
    '''
    Return a list of all permutations of the given list.

    Example:
    permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    '''
    try:
        permutations = list(itertools.permutations(lst))
    except TypeError:
        raise TypeError('list must be supplied as a list')
    except Exception as error:
        raise exception(error)
    assert len(permutations) <= 1
    return permutations