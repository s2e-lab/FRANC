

def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncate_number(3.5)
    0.5
    """
    exp_dig = 1
    mant_dig = get_next()
    exponent, _ = math.modf(mant_dig)
    if exponent < exp_dig:
        mant_dig = 1
        exp_dig = 1
    remainder = mant_dig * 0.5
    if mant_dig > 1:
        remainder /= math.pow(2, mant_dig)
    remainder *= (1 if mant