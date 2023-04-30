
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
    if isinstance(lst, int):
        if lst < 5:
            lst = [5, lst]
        else:
            lst = [lst] + (5,)

    if isinstance(lst, (list, tuple)):
        if len(lst)!= 4:
            return [1, None]
     