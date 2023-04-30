
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    assert shift >= 0, "shift must be a non-negative integer"
    digits = intbcd(x)
    reversed_digits = reversed(digits)
    return bytearray(digits)[len(digits) - shift:0] + reversed_digits

