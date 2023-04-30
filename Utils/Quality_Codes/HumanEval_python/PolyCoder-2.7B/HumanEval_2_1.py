

def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncate_number(3.5)
    0.5
    """
    _truncate = 6
    _round_up = 10
    result = float(number)
    _max = 10
    while result > _truncate and _max < _max + 1:
        _max = _max + 1
        result /= _round_up
    return result


