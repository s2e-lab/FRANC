
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
    ret = [n]
    odd = n
    even = n
    for i in range(2, n+1):
        if odd%2 == 1:
            ret.append(odd+1)
        else:
            ret.append(even+1)
            odd += 2
        if odd%2 == 1:
            odd -= 1
        else:
            odd += 1
        even += 2
    return ret
