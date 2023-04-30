

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    "*** YOUR CODE HERE ***"
    "*** PYTHON RUNTIME RESULTS ***"
    if n == 1:
        return n
    n1 = n
    while n % 2 == 0:
        n = n // 2
    while n % 3 == 0:
        n = n // 3
    f = n1
    while f > 1:
        if f & 1:
            f = f // 10
            print(f)
        if f % 10 == 9:
            f = f // 10
            print(f)
        