

def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncate_number(3.5)
    0.5
    """

    if abs(number) < 1e-20:
        return 0

    # ToDo: Replace with round(number *.01, 1)
    # In future we might use the remainder, since it gives more precision
    #
    # The number can be computed with the following two methods:
    #       x - (floor(x + 0.5));
    #       x - (floor((x + 0.5)