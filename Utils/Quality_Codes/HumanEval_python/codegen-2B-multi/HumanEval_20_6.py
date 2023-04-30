from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:
    """ From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
    (2.0, 2.2)
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
    (2.0, 2.0)
    """
    # For this exercise, we're going to start with the smallest number and check the rest (the biggest).
    # The smaller number should always be closer to our current number than the bigger
    # (even if the smaller number is much larger than the current one).
    closest_index = 0
    closest_diff_index = 1
    smallest_diff = 9999

    for index in range(len(numbers)):
        if numbers[index] < numbers[closest_index]:
            # There are elements further towards the end than before.