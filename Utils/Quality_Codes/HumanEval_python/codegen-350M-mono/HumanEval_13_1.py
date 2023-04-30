

def greatest_common_divisor(a: int, b: int) -> int:
    """ Return a greatest common divisor of two integers a and b
    >>> greatest_common_divisor(3, 5)
    1
    >>> greatest_common_divisor(25, 15)
    5
    """
    a = str(a)
    b = str(b)
    count = 0
    for i in range(1, len(a)):
        #counting the common divisors of length i
        if (a[i-1]) == b[i-1]:
            #if all of them are the same, don't add up
            count+= pow(int(a[i-1]+b[i-1]) - int(a[i-1] + b[i-1]), 2)
        else:
            if int(a[