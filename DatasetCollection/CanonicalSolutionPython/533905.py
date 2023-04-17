import itertools
def cartesian_product_of_lists(lists):
    '''
    Return the cartesian product of the given list of lists.

    Example:
    cartesian_product_of_lists([[1, 2], [3, 4]]) -> [(1, 3), (1, 4), (2, 3), (2, 4)]
    cartesian_product_of_lists([[1, 2], [3, 4], [5, 6]]) -> [(1, 3, 5), (1, 3, 6), (1, 4, 5), (1, 4, 6), (2, 3, 5), (2, 3, 6), (2, 4, 5), (2, 4, 6)]
    '''
    return [tuple(x) for x in itertools.product(*lists)]