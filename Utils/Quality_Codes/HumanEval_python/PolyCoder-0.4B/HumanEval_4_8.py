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
    # First normalize the data
    norm = numbers_to_d2norm(numbers)
    norm = np.log10(norm)
    norm = np.sqrt(norm)

    # Now calculate the mean absolute deviation
    mean_x_mean_x = np.mean(norm / numbers[-1])
    mean_x_mean_x = 1.0 / mean_x_mean_x

    return mean_x_mean_x


def means_are_finite