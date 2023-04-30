from typing import List


def has_close_elements(numbers: List[float], threshold: float) -> bool:
    """ Check if in given list of numbers, are any two numbers closer to each other than
    given threshold.
    >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
    False
    >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
    True
    """
    assert threshold > 0
    assert len(numbers) > 0
    assert all(isinstance(x, float) for x in numbers)
    assert all(x < threshold for x in numbers)

    pairs = set(zip(numbers, numbers[1:]))
    return len(pairs) > 1 and any((x + threshold) <= (y + threshold) for pair in pairs for x, y in pair)


