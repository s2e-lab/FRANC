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
    list_of_distances = [i / len(numbers) for i in numbers]

    numbers_by_mean = {
        float(n) / len(len(number)): n **.5
        for n, number in zip(list_of_distances, numbers)
    }

    mean_between_distances = numbers_by_mean['mean between']
    mean_abs_distances = numbers_by_mean['absolute dist']
