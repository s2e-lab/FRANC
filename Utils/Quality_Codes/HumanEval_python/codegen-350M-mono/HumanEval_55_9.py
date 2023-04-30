

def fib(n: int):
    """Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
    """
    prev, curr = 1, 2
    fib = curr

    if n == 0:
        return 0

    if n == 1:
        return 1

    if fib == 2:
        return 2

    while prev <= n:
        next = prev + curr
        prev = curr
        curr = next

        fib = next

    return fib
