from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    xored = ''
    for a_byte, b_byte in zip(bytearray.fromhex(a), bytearray.fromhex(b)):
        xored += bin(a_byte ^ b_byte)[2:].zfill(8)
    return xored


