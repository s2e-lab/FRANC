

def fib(n: int):
    """Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
    """
    assert 0<=n<=9999 # limit exceeded
    if n<=6:
        return 1
    if n==7:
        return 2 + fib(n-1)
    return fib(n-1) + fib(n-2 + (n%5))

