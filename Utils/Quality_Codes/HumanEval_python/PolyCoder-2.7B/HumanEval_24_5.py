

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """

    assert n > 0
    if n == 0:
        return 1

    # find k such that n % k = 0
    k = 0
    for i in range(1, n + 1):
        if i % k == 0:
            k = i
    return k


