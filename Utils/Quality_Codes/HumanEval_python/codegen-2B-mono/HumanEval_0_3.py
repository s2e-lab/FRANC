from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    for j, second_number in enumerate(numbers):
        if j!= 0:
            for i, first_number in enumerate(numbers):
                if i!= j and abs(second_number - first_number) < threshold:
                    return True
    return False


