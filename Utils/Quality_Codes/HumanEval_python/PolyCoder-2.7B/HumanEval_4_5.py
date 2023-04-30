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
    import numpy as np
    import pandas as pd

    mean = np.nanmean(numbers)
    indices = np.arange(len(numbers))

    if len(numbers) == 0:
        mean = 0.0
    elif len(numbers) == 1:
        mean = len(self.dataset.numbers)
    elif len(numbers) == 2:
        diff = (numbers[0] - numbers