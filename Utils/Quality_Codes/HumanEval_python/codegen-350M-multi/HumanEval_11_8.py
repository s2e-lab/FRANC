from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    result = [('0' if x in a else '1') for x in a]
    for a_pos, b_pos, b_val in zip(a, b, result):
        result[b_pos] = a_pos
    return ''.join(result)
