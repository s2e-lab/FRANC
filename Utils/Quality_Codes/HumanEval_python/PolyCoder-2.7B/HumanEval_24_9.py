

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """
    maxn = max(n)
    idx = 0
    while maxn % n:
        maxn += n
        idx += 1
    res = idx - 1
    return maxn // res + 1


