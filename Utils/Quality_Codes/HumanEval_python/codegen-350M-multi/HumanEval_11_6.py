from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    bxor = '0'
    for i in range(len(a)):
        bxormask = bxor if chr(a[i]) == bxor else str(a[i])
        band = '1' if bxormask in a else '0'
        bxor = bxor + band
    return bxor


