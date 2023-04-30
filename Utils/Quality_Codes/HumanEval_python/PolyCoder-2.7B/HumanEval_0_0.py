from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    if set(numbers) == set(
        [value or 0.0 for value in numbers]
    ):  # no value is in the list -> all numbers are close to each other
        return True
    elif len(lists) == 1 \
            and len(numbers) >= 2 \
            and sorted(numbers) == sorted(set(numbers)) \
         