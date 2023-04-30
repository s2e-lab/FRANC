

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """
    # if the number is an even number, we can find the divisor only using
    # the integer division operation
    gcd = gcd_by_d(n, 0)
    return (n - gcd(n))//2


