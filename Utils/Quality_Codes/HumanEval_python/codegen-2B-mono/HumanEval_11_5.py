from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    assert isinstance(a, str), 'a should be a string'
    assert isinstance(b, str), 'b should be a string'
    return a.replace('X', '') + a.replace('X', '', 1) + b.replace('X', '') + b.replace('X', '', 1)


