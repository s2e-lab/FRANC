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
    if not isinstance(numbers, list):
        numbers = [numbers]
    mean_dev = sum(numbers) / len(numbers)
    mad_mean = np.abs(mean_dev - mean_dev.mean())
    if mad_mean < 0.001:
        warnings.warn("Smallest data point is 0.0. Discarding 0.05,0.1,...,0.9")
        return 5.0

  