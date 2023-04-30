from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    a = a.split(' ')
    b = b.split(' ')
    result = set()
    for s in a:
        result |= set((b[0] or 0) ^ (s[0] or 0))
        result |= set((b[1] or 0) ^ (s[1] or 0))
    return ''.join(result)

