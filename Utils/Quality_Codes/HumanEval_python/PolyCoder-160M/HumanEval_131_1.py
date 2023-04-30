
def digits(n):
    """Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
    """
    n_prime = int(n / 2)
    if n_prime == 0:
        return 1
    elif n_prime <= 2**64:
        return 0
    elif n_prime <= 2**32:
        return 1
    elif n_prime == 2**32:
        return 3
    else:  # We have 2**(64/8)-1 (2**32)/2 (2