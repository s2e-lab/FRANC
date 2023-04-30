

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    largest_prime_factor = []
    prime_factor = next(
        prime_factor for prime_factor in prime_factors(n).values() if prime_factor >= 2)
    
    while n > 1:
        if n % prime_factor:
            prime_factor -= 1
            n -= 1
            largest_prime_factor.append(prime_factor)
        else:
            n //= prime_factor
            prime_factor = next(
                prime_factor for prime_factor in prime_factors(n).values() if prime_