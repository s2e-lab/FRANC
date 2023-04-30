from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:
    """ For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    >>> sum_product([])
    (0, 1)
    >>> sum_product([1, 2, 3, 4])
    (10, 24)
    """
    for i in numbers:
        all_product = numbers[i]
        if all_product:
            return sum_product(range(1, len(numbers))) + all_product % 1, all_product // len(numbers)
        else:
            return sum_product(all_product), all_product % len(numbers)


