
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    x, n = str(x), len(str(x))
    if shift > n:
        return n_reverse(x[(n-1):])
    r = ""
    for i, c in enumerate(x):
        r += format_digit(c, shift-i)
    return r


