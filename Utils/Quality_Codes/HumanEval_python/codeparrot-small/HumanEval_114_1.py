
def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """
#    while len(nums) > 2:
#        nums.pop()
    nums.reverse()
    tmp1 = nums[0]
    tmp2 = nums[len(nums)-1]
    idx1 = tmp1[0]
    idx2 = tmp2[0]

    while len(nums) > 1:
        if idx1 == idx2:
            temp = 0
            while idx1 <= idx2:
                temp += nums[idx1]
                idx2 -= 1
                idx1 += 1
            return temp
        num1, num2 = nums[idx1], nums[idx2]
       