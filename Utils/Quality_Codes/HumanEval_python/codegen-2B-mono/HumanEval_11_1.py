from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """
    tmp = ""
    for i in range(0, a):
        if i == b:
            tmp = tmp + str(1 - int(a[i]))
        else:
            tmp = tmp + a[i]
    # print(tmp)
    return tmp


