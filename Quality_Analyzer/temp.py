
def generate_integers(a, b):
    """
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generate_integers(2, 8) => [2, 4, 6, 8]
    generate_integers(8, 2) => [2, 4, 6, 8]
    generate_integers(10, 14) => []
    """
    if a > b:
        # if b is zero, we need to divide by the even number
        a, b = b % 10, a // 10
    return [int(round(a, 2)), int(round(b, 2)) if b else int(-b) % 10 else None]

