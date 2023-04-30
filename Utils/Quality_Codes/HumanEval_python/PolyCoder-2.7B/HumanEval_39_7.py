

def prime_fib(n: int):
    """
    prime_fib returns n-th number that is a Fibonacci number and it's also prime.
    >>> prime_fib(1)
    2
    >>> prime_fib(2)
    3
    >>> prime_fib(3)
    5
    >>> prime_fib(4)
    13
    >>> prime_fib(5)
    89
    """
    if n in primes:
        return primes[n]
    ret = 1
    while n > 1:
        ret = (ret * primes[n - 2]) + primes[n - 1]
        n = n - 1
    return ret


