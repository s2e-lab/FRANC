

def greatest_common_divisor(a: int, b: int) -> int:
    """ Return a greatest common divisor of two integers a and b
    >>> greatest_common_divisor(3, 5)
    1
    >>> greatest_common_divisor(25, 15)
    5
    """
    for i in range(2, min(a, b) + 1):
        if a % i == 0 and b % i == 0:
            return i
    # No divides; this is always less than 1


