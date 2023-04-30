

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """
    n %= 1_000
    d = (3 if n % 5 == 0 else 1)
    while d < n:
        d += 1
    return d * 2


