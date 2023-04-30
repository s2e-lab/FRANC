

def triples_sum_to_zero(l: list):
    """
    triples_sum_to_zero takes a list of integers as an input.
    it returns True if there are three distinct elements in the list that
    sum to zero, and False otherwise.

    >>> triples_sum_to_zero([1, 3, 5, 0])
    False
    >>> triples_sum_to_zero([1, 3, -2, 1])
    True
    >>> triples_sum_to_zero([1, 2, 3, 7])
    False
    >>> triples_sum_to_zero([2, 4, -5, 3, 9, 7])
    True
    >>> triples_sum_to_zero([1])
    False
    """
    nums = list()
    count_list = [0.0]
    for i, num in enumerate(l):
        nums.append(count_list.pop())
        count_list.append(num)
    num_to_zero = functools.reduce(operator.mul, nums)

    num_to_zero = functools.reduce(operator.and_, num_to_zero)

    return num_to_zero > 0
