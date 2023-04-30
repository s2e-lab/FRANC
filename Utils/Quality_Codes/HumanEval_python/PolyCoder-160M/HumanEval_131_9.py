
def digits(n):
    """Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
    """
    if not n:
        return 1
    else:
        return n % 2

#
#   Test with a few numbers - this is a test to see if the numbers are even.
#   For example:
#        1 + 2 + 10
#        2 + 3 + 9
#        4 + 5 + 10
#

