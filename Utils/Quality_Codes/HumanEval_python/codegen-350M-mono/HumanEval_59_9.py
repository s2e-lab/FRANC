

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    l = []
    while n%2==0:
        n = n//2
        l.append(2)
    for e in l:
        if n%e==0:
            n = n//e

    if n!=1:
        l.append(n)

    l_prime_factors = []
    for e in l:

        if e>1:
            l_prime_factors.append(e)
        else:
            continue
    return(len(l_prime_factors))



def