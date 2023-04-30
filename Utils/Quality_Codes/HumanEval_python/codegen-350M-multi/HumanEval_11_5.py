from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    if ''!= a and ''!= b:
        a = chr(compress_nonprintable(ord(a.lstrip('\n'))))
        b = chr(compress_nonprintable(ord(b.lstrip('\n'))))

    return a ^ b


