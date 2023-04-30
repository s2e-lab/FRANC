

def greatest_common_divisor(a: int, b: int) -> int:
    """ Return a greatest common divisor of two integers a and b
    >>> greatest_common_divisor(3, 5)
    1
    >>> greatest_common_divisor(25, 15)
    5
    """
    if(b%a==0 and b/a==1):
        return b
    else:
        b=a
    for i in range(2,max(b,a)):
        if a%i==0 and b%i==0:
            return i
            
