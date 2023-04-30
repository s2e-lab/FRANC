

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
    if n == 1:
        return False
    if n == 2 or n == 3 or n == 5 or n == 7:
        return True
    d = 2
    while d*d <= n:
        if n % d == 0:
            return False
        d = d+1
    return True
