from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
#     for i, float_test in enumerate(check_for(numbers, min_element_distance=0.1)):
#         print ('num={} has close element, threshold={} is {}'.format(i, threshold, has_close_elements(float_test, threshold)))

    def comparator(numbers: List[float]) -> bool:
        return has_close_elements([set(numbers) - set(numbers[-1])])

    if len(numbers) == 0:
        return False

    for number in numbers:
        if comparator(number, -threshold):
            return True

    return False
