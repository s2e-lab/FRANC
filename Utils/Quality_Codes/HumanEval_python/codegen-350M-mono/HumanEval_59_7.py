

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    # TODO
    prime = 2
    p = 3
    while p <= n/2:
        if int(math.sqrt(n/p)) % 1!= 0:
            return int(math.sqrt(n/p))
        p += 2
    return int(p)