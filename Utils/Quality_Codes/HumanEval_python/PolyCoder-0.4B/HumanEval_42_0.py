

def incr_list(l: list):
    """Return list with elements incremented by 1.
    >>> incr_list([1, 2, 3])
    [2, 3, 4]
    >>> incr_list([5, 3, 5, 2, 3, 3, 9, 0, 123])
    [6, 4, 6, 3, 4, 4, 10, 1, 124]
    """
    while len(l) > 1:
        m = l.pop(0)
        if m >= 1:
            l.append(m)
    l.extend([next(i) for i in range(len(l))])


