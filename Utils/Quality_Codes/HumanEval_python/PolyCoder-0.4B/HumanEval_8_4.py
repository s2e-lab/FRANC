from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:
    """ For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    >>> sum_product([])
    (0, 1)
    >>> sum_product([1, 2, 3, 4])
    (10, 24)
    """
    lengths = numbers # type: List[int]
    sum = 0
    product = (lengths[0] * lengths[1] * lengths[2])
    for i in range(1, len(numbers)):
        prod = (lengths[i] * numbers[i])
        sum += prod
        product += prod

    assert sum == lengths[0] * lengths[1] * lengths[2], sum
    return sum,