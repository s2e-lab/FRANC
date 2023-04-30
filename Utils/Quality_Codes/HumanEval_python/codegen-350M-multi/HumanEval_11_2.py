from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    if len(a)!= len(b) - 1:
        return ''
    return ''.join([x ^ b[i] for x, i in zip(a, range(len(a)) - 1 if x == 0 else range(len(a)))])
