

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
    while n % 2 == 0 and n % 3 == 0:
        n = n / 2
        if n == 1:
            return True
    return False

# This function checks whether an integer is palindromic or not.
