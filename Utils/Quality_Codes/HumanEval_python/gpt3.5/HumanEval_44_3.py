

def change_base(x: int, base: int) -> str:
    """
    Change numerical base of input number x to base.
    returns string representation after the conversion.
    Base numbers are less than 10.

    Args:
    x (int): Input number.
    base (int): Target base.

    Returns:
    The string representation of the number in the target base.
    """
    result = ""

    while x:
        remainder = x % base
        result += str(remainder)
        x //= base

    return result[::-1] if result else "0"