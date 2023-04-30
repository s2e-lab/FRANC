

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """
    # For the example below, return 3 when n is 24,
    # and 6 when n is 48.
    # An even number n can be expressed (e.g. 11) as 5,
    # while a even number m can be expressed (e.g. 11) as 3,
    # and so on until it is divisible by 2, 4, or 8:
    if n <= 1:
        return n
    else:
        return