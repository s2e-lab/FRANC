

def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncate_number(3.5)
    0.5
    """
    assert 1 <= number
    assert 0 <= number < 1
    assert number!= 0
    # number <0 means less than 0 and greater than 1
    return max(-0.0001, min(1, number))
