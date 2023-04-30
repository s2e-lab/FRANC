

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
    i = 2
    if n >= 1 and n <= 3:
        return n == 2 or n == 3
    if n > 2 and n % 2 == 0:
        return False
    i = 3
    while i < max(n, 4):
        if n % i == 0:
            return False
        i = i + 2
    return True



