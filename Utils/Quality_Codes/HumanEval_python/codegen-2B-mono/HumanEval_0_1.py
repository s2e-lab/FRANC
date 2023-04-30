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
        raise ValueError("threshold should be greater than zero")

    checked_numbers = []
    for number in numbers:
        if number < threshold:
            return True
        checked_numbers.append(number)

    # Check if all numbers are not checked
    if not any(_ > threshold for _ in checked_numbers[:-1]):
        return False
    # If numbers are greater than threshold, see if any are not greater than threshold
    for i in range(len(checked_numbers) - 1):
        