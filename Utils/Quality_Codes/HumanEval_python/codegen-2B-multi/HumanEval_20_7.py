from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:
    """ From a supplied list of numbers (of length at least two) select and return two that are the closest to each
    other and return them in order (smaller number, larger number).
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
    (2.0, 2.2)
    >>> find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
    (2.0, 2.0)
    """
    assert len(numbers) >= 2, "At least two numbers required to calculate next closest pair"

    if list(sorted(numbers)) == sorted(numbers):
        # Already sorted
        return (numbers[0], numbers[-1])

    index1 = numbers.index(min(numbers))
    index2 = numbers.index(max(numbers))

    return (numbers[index1], numbers[index2])


