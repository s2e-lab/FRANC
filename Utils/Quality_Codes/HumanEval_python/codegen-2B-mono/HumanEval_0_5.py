from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    sorted_elements = sorted(numbers)
    lenght = len(sorted_elements)
    min_pos = 0
    min_val = sorted_elements[0]
    max_val = sorted_elements[lenght-1]
    counter = 0
    while max_val - min_val < threshold:
        if max_val > min_val:
            if sorted_elements[min_pos] == min_val:
                sorted_elements[min_pos] += 1
                min_val