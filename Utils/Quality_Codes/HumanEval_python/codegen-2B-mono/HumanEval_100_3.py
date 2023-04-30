
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
    # Your code here
    if n % 2 == 0:
        total = (n + 1) // 2
        n //= 2
        a = 1
        k = 1
        while k <= n:
            a *= k
            b = int(total - k)
            k += 2
            if k <= n:
                a *= k
                b *= k
            k += 2
            total = a + b
        return list(a, total)
    else:
        total = 1 + (n + 1) // 2
        