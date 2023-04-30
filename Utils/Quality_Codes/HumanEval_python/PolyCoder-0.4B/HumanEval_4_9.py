from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:
    """ For a given list of input numbers, calculate Mean Absolute Deviation
    around the mean of this dataset.
    Mean Absolute Deviation is the average absolute difference between each
    element and a centerpoint (mean in this case):
    MAD = average | x - x_mean |
    >>> mean_absolute_deviation([1.0, 2.0, 3.0, 4.0])
    1.0
    """
    assert isinstance(numbers, (list, tuple))
    for number in numbers:
        # Only need to work for floats
        mean = numbers[number] / numbers.count(number)
        mean = mean.mean()
        if mean is not None:
            return num2float(mean)
    raise Exception("This dataset does not contain values; please select at least one value")

