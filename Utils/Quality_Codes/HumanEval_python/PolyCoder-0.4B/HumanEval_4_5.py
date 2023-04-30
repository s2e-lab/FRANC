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
    if len(numbers):
        mean = np.array([float(x) for x in numbers])
        mean[mean == 0] = 1.0
        # Note: The output contains only the mean. We need to invert to
        # ensure that the result is always > 0 and < 1.
        return (mean >= 0.0) * (mean + 1.0)


def mean_absolute_deviation_