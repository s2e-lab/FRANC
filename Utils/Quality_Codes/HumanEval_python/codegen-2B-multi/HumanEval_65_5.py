
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    digi_s = x[::-1]
    num = 0
    while digi_s:
        digi, digi_s = digi_s[:1], digi_s[1:]
        num += len(digi) * (len(digi_s) - shift)
    return str(num)

