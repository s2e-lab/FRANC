from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
#     largest = [float(i) for i in numbers]
#     smallest = [-float(i) for i in numbers]
#     close_index = -1
#     if largest[close_index] < -smallest[close_index]:
#         close_index = -1
#     for item in numbers:
#         if item > close_index:
#             close_index = item
#     return close_index == smallest[close_index]
# -*- coding: utf-8 -*- #