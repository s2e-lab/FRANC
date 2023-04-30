from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:
    """ From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
    (2.0, 2.2)
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
    (2.0, 2.0)
    """
    assert len(numbers) > 1
    
    current_distance = numbers[0]
    two_closest_indices = 0
    for i in range(1, len(numbers)):
        distance = 0.0
        for j in range(0, len(numbers) - 1):
            distance += math.fabs(numbers[j] - numbers[j + 1])
        distance /= 2.0
        if distance < current_distance:
            two_closest_indices = i
        elif two_