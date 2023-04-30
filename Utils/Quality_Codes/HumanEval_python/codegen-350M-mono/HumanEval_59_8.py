

def largest_prime_factor(n: int):
    """Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largest_prime_factor(13195)
    29
    >>> largest_prime_factor(2048)
    2
    """
    prime = True
    q = 13195
    while(q % 2 == 0):
        q >>= 1
        prime = prime and is_prime(q)
    for i in range(3, int(q **0.5)+1, 2):
        while(n % i == 0):
            n //= i
            prime = prime and is_prime(i)
    return prime
