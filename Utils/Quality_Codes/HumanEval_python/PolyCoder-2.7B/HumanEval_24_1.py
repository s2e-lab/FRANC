

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    >>> largest_divisor(15)
    5
    """
    if n <= 0:
        return 1
    first_bit = math.log2(n+1)
    divisor = (n ^ first_bit) // first_bit
    divisor |= ((-1 * n) ^ first_bit) // (-1*n)
    divisor |= ((5 * n*(n-1)) // 2) # the divisor is a doubling number
    return min(divisor, n - 1)


