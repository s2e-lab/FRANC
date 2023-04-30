from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    assert len(numbers) > 0, "This function is missing some elements"
    i = 0
    while i < len(numbers):
        j = i + 1
        while j < len(numbers):
            if numbers[j] < numbers[i] + threshold:
                return False
            j += 1
    