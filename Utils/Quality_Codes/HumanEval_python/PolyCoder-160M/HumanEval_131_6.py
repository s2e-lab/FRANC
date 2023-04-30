
def digits(n):
    """Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
    """
    d = 0
    while n!= n:
        digit = (n - 1) / 2
        d *= 10
        d += digit * digit
    return n / d


