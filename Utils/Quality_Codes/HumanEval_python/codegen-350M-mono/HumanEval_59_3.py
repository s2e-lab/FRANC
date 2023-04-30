

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    lgst = 2
    while lgst * lgst <= n and n!= 1:
        d = n % lgst
        if d in lgst:
            lgst += (d)
        else:
            break
    return (lgst)
