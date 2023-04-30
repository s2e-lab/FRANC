
def digits(n):
    """Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
    """
    if n % 2:
        return n + 1
    res = 0
    for odd in range(n):
        res += 1
        if odd:
            res -= 1
    return res

