from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    # the output of binary xor
    output = ""

    # iterating through the first string
    for i in range(0, len(a)):
        # first and second elements of binary form of 1
        b1_str, b2_str = a[i], b[i]
        string_of_one, string_of_zero = int(b1_str, 2), int(b2_str, 2)
        # if the first and second elements are
        # different we calculate the binary xor and add the result to the output
