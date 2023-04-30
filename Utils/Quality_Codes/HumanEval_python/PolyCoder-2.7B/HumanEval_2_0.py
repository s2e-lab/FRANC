

def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncate_number(3.5)
    0.5
    """
    number = number.lstrip('%')
    if len(number) == 0:
        raise ValueError('Can’t format {} into 0.0'.format(number))
    while number[-1] == '0':
        number = number[:-1]
    while number[-2] == '0':
        number = number[:-2]
    while number[-3] == '0':
        number = number[:-3