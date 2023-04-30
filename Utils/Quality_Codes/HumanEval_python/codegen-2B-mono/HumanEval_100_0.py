
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
    assert n > 0, 'n must be greater than 0'

    level = n
    pile = []
 
    while level > 0:
        if n % 2 == 0:
            pile.append(level)
            level -= 1
        else:
            pile.append(level + 1)
            level -= 2

    return pile

