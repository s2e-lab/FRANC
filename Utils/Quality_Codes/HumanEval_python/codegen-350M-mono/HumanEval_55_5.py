

def fib(n: int):
    """Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
    """
    assert n>0
    fibonacc_prev, fibonacc = 0,1
    for i in range(2,n):
        fibonacc = (fibonacc * i) + fibonacc_prev
        fibonacc_prev, fibonacc = fibonacc, fibonacc_prev
    return fibonacc
