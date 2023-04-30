

def fib(n: int):
    """Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
    """
    if n in [0, 1]:
        return 1
    if n in [1, 2]:
        return 1

    return fib(n - 1) + fib(n - 2)


# Q7

# The first term of the series is 1, the second is 2, and the third term is 4.
# Hence, the series is 12 + 24 + 40 = 120.
def fib(n: int):
    """Return the n-th Fibonacci number.
    >>> fib(10)
    52
    >>> fib(1)
    1