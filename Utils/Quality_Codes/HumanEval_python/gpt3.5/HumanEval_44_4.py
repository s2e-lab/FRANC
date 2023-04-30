

def change_base(x: int, base: int) -> str:
    """
    Changes the numerical base of input number x to base.
    Returns a string representation after the conversion.
    Base numbers are less than 10.

    :param x: Input integer to be converted.
    :param base: Desired numerical base for conversion.
    :return: String representation of converted input integer.

    >>> change_base(8, 3)
    '22'
    >>> change_base(8, 2)
    '1000'
    >>> change_base(7, 2)
    '111'
    """

    res = ''
    while x > 0:
        res += str(x % base)
        x = x // base
    return res[::-1]