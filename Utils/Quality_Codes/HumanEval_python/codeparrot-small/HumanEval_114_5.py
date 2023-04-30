
def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """
#     minSubArraySum([[1, 2, 3, 4],
#                       [-1, -2, -3],
#                       [4, 1, 2, 3],
#                           [-1, 0, -3]]) == 4
    # return (1, 2, 3, 4)
    nums.sort()
    i = nums.index(nums[len(nums) - 1])
    assert nums[i] == 0
    return nums[i]



# ----------------------------------------------------------------
