
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    if x == 0:
        return ""
    circular_reversed = str(x)[::-1]
    circular_shifted, carryin = 0, 0
    while len(circular_reversed) > 0:
        count = len(circular_reversed)
        if count - shift > 0:
            count = count - shift
            circular_shifted = circular_shifted + int(circular_reversed[-shift:])
            circular_reversed = circular_reversed[:-count