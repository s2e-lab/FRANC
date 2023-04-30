
def make_a_pile(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> make_a_pile(3)
    [3, 5, 7]
    """
    
    if n <= 0 or n % 2 == 0:
        return []
    ret = []
    ret.append(make_a_pile(n // 2))
    ret.append(make_a_pile(n // 2 + 1))
    return ret

# test cases
# [[5], [5, 0, 4, 6, 5, 9, 5]] # correct
# [[4, 0, 3, 3, 4, 9], [5, 5, 5, 5, 5, 5, 7, 7, 8]] # correct
#