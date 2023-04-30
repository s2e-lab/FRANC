

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
    # using int type here to allow overflow as dict doesn't like division
    # as a result this would be much more efficient, but at the expense
    # of a lot of extra tests we already need to verify these values
    # are prime
    return 1 if n <= 2 else n**n

