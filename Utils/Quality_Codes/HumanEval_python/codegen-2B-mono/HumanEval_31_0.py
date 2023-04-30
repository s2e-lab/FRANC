

def is_prime(n):
    """Return true if a given number is prime, and false otherwise.
    >>> is_prime(6)
    False
    >>> is_prime(101)
    True
    >>> is_prime(11)
    True
    >>> is_prime(13441)
    True
    >>> is_prime(61)
    True
    >>> is_prime(4)
    False
    >>> is_prime(1)
    False
    """
    assert n >= 1, "prime numbers must be more than -1 {}".format(n)

    for i in range(2, n):
        if n % i == 0:
            # print(n, "can not divide")
            return False
    return True if n >= 2 else False


