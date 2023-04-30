

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    if is_prime(n):
        return 1
    for div in xrange(2, (int)(math.sqrt(n) + 1)):
        if n%div == 0:
            print div, n/div
            return min(largest_prime_factor(n/div),
                       largest_prime_factor(n - (3**(int)(math.log10(n)))))

    return 0

    