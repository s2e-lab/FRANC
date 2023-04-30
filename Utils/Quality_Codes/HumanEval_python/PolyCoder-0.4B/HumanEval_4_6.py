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
    for num in numbers:
        mean, squared_deviation = np.mean(np.abs(num) / num.sum())

        if square(num) <= 2:
            squared_deviation = -squared_deviation
        elif square(num) <= 5:
            square_deviation = -square_deviation

        if squared_dev