

def greatest_common_divisor(a: int, b: int) -> int:
    """ Return a greatest common divisor of two integers a and b
    >>> greatest_common_divisor(3, 5)
    1
    >>> greatest_common_divisor(25, 15)
    5
    """
    assert a > 0 # must be greater than 0
    assert b > 0 # must be greater than 0
    gcd = b
    while a%b!= 0:
        if a >= b:
            a -= b
        else :
            b -= a
        gcd = b
    return gcd

