from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:
    """ From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
    (2.0, 2.2)
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
    (2.0, 2.0)
    """
    # noinspection PyUnusedLocal
    max_distance_above, max_distance_below = find_closest_above_below(numbers)
    if max_distance_below < max_distance_above:
        return max_distance_below, max_distance_above
    return max_distance_above, max_distance_below


