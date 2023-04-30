from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:
    """ From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
    (2.0, 2.2)
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
    (2.0, 2.0)
    """
    e, w = float('inf'), float('inf')
    for value in numbers:
        if value < numpy.finfo('float32').min or value > numpy.finfo('float32').max:
            raise Exception('Number must be between {} and {}'.format((numpy.finfo('float').eps, numpy.finfo('float32').max)))
        if w > abs(w - value):
            e, w = value, w
    return e, w

