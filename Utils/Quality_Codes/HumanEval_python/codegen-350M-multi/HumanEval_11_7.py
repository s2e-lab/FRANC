from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    if a == b:
        return a

    chars_a = a.upper().rstrip()
    chars_b = b.upper().rstrip()
    chars_result_str = "".join([char for char in chars_a if char!= char[0]])
    chars_result_str += "".join([char for char in chars_b if char!= char[0]])

    return "".join([ch for ch in chars_a if not ch in chars_b])

