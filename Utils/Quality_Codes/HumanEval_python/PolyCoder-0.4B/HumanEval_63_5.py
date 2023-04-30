

def fibfib(n: int):
    """The FibFib number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
    fibfib(0) == 0
    fibfib(1) == 0
    fibfib(2) == 1
    fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
    Please write a function to efficiently compute the n-th element of the fibfib number sequence.
    >>> fibfib(1)
    0
    >>> fibfib(5)
    4
    >>> fibfib(8)
    24
    """
    h = n // 3 + 1
    if h >= 2:
        return FIB(n, n // 3)
    if h == 3 and n == 1:
        return FIB(1, 3)
    # print(n)
    return FIB(n-1, (h-2) * 3 + n + 1)


