
def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """
#   sum(nums) --> sum(nums)
    nums = copy(nums)
    if not nums[len(nums)-1] <= nums[0] :
        return 0
    if nums[len(nums)-1] == 0:
        return nums[0]
    # sum(x2, x3) --> sum(x1, x3,...
    i = 0
    while i < len(nums) :
        d = 1
        for j in range(i+1,len(nums)):
            if nums[j] :
                d *= nums[j]
        sumval = 0
       