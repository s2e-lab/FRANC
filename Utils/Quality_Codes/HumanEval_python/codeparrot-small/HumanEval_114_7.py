
def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """
#     return min(nums)
#
    if nums == []: raise ValueError()
    x = len(nums)
    res = 0
    minSum = 0
    for i in range(x-1, -1, -1):
        minSum += nums[i]*nums[i+1]
        res += nums[i]
    return minSum
#
# def sumSum(nums):
#     return sum(nums)
#
# def isEmpty(s):
#     return s==0
#
# def uniqueList(val):
#     lst = set()
#