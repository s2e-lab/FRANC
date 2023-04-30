from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    len_a, len_b = len(a), len(b)
    if len_a == len_b:
        return str(int(a) ^ int(b))
    else:
        raise Exception('Different length')


