from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:
    """ From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
    (2.0, 2.2)
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
    (2.0, 2.0)
    """
    assert len(numbers) >= 2
    a = numbers[0]
    b = numbers[1]
    min_distance = numbers[0] * numbers[0]
    c = None
    for n in numbers[2:]:
        new_distance = numbers[0] * numbers[0] + numbers[1] * numbers[1] + n * n
        if new_distance < min_distance:
            a = b
            c = n
            min_distance = new_distance
    return a, c


def get_random_element