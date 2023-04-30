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
    for number in numbers:
        mean = (number - mean_mean(number)) / mean_absolute_deviation_scaling
        return mean if (mean > 0.95 or mean < -0.95) else -mean
    return 0.


