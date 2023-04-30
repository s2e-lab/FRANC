
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    digits = reversed(str(x))
    if shift <= 0:
        return digits
    shift %= len(digits)
    if shift == 0:
        return digits
    circular_digits = [digits[-1]]
    left_shift = shift - 1
    while left_shift > 0:
        circular_digits.insert(0, circular_digits.pop())
        left_shift -= 1
    return ''.join(circular_digits)


