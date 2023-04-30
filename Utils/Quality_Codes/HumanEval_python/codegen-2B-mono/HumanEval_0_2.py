from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    numbers = sort_numbers(numbers)
    for i in range(len(numbers)):
        min_val = numbers[i]
        for j in range(i + 1, len(numbers)):
            max_val = numbers[j]
            if is_close(min_val, max_val, threshold):
                return True
    return False


