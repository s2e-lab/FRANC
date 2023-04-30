
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
    if not isinstance(lst, int):
        return list(lst)
    # [1,2,3,4] is max.
    min1, max1 = lst
    for n in reversed(range(max1)):
        l1 = min1 + n
        l2 = max1 + n - 1
        if l1 in lst:   # in case l2 is in lst
     