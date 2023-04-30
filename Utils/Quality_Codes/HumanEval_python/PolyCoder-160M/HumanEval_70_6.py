
def strange_sort_list(lst):
    '''
    Given list of integers, return list in strange order.
    Strange sorting, is when you start with the minimum value,
    then maximum of the remaining integers, then minimum and so on.

    Examples:
    strange_sort_list([1, 2, 3, 4]) == [1, 4, 2, 3]
    strange_sort_list([5, 5, 5, 5]) == [5, 5, 5, 5]
    strange_sort_list([]) == []
    '''
    def sort_list(nums):
        """Sort number list in one list and return it in sorted order."""
        for num in nums:
            p_id = num
            if p_id not in list((i, i + len(nums) for i in p_id), (i + len(nums) for i in p_id)):
                return