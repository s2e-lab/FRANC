from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    if threshold < 0:
        raise ValueError("Invalid threshold, it should be a float value greater or equal to zero.")

    for i, val in enumerate(numbers):
        for num_i in numbers[i+1:]:
            if abs(val - num_i) <= threshold:
                return True

    return False


