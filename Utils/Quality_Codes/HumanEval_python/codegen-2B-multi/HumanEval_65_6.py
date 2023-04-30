
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    sign =''
    if x < 0:
        sign = '-'
    # Number of digits in a string
    num_digits = len(str(abs(x)))
    # Number of digits to insert + # digits left shifted
    start_insert = num_digits - 1 - shift
    # string to insert
    insert_str = '1' * start_insert * sign
    # The result at the end
    result_str = '1' * (len(x) - shift) + x[start_insert:]
    return insert_