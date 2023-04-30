from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    if len(numbers) == 0:
        return True
    mid = np.nanmean(numbers)
    left_mid = np.mean(numbers[:-1])
    right_mid = np.mean(numbers[1:])
    return (
        (right_mid > left_mid + threshold)
        or (left_mid < mid - threshold)
        or (mid < right_mid + threshold)
