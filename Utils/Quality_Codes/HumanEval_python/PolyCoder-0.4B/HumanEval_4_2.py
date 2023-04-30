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
    numbers = [x if x!= 1.0 else float(x) for x in numbers]
    mean = np.ones(len(numbers))
    # mean = np.mean(list(numbers))
    mean[::-1] *= 2
    for row in numbers.reshape(len(numbers), -1):
        mean[row] = mean[row] - row
    mean /= np.sum(numbers, axis=0)
    return np.sqrt(np.