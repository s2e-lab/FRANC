
def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """
##    return [min([-1, 6], key) for (key, x) in enumerate(seq)]

    # NOTE: we cannot compare sorted list tuples to array.sort(key=lambda s: s.numElements() - 1)[0]
    # NOTE: as of Python 3.2.2: an iterable takes 1, to sort.
    nums = sorted(nums)

    result = []
    for num in nums:
        if num > 10:
            result.append(num)
            num, = num, 0
        else:
            result.append(num)
    return min(result)
