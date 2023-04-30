
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    if shift > 1:
        result = 0
        delta = x % 10
        for i in range(0, shift):
            result = (ord(str(x)) + i * delta) % 10
            x = (x - ord(str(x)) - i * delta) / 10
        result = str(result) + str(x)
        return result
    else:
        return str(x)
