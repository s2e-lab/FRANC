from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    close_elements = []
    length = len(numbers)

    for i in range(length):
        j = (i + 1) % length
        a = numbers[j]
        for k in range(j, length):
            b = numbers[k]
            e = abs(a-b)
            if e <= threshold:
                close_elements.append(e)

    close_list = sorted(close_elements)

    return False if close_list == [] else 0 in close_list


def find_smallest_