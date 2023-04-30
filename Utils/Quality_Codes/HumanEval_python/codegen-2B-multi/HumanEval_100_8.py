
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
    res = [1]
    prev_num = n - 1
    while prev_num > 0:
        cur_num = prev_num/2
        if cur_num%2 == 0:
            res.append(cur_num)
            prev_num -= cur_num
        else:
            res.append(cur_num+1)
            prev_num -= prev_num%2
    return res
