

def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncate_number(3.5)
    0.5
    """
    n = int(np.floor(number))
    n = min(n, int(np.log10(abs(number))) - 1)

    # Remove trailing zeros
    while n!= 0:
        n = n // 10

    # Truncate to whole number
    return n


def truncate_number(number: str) -> str:
    """ Given a numeric string, it returns another numeric string that
    exactly equals the amount in number string. 