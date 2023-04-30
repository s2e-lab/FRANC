
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
    
    list_sort = [
    [0, 1, 2, 3, 5, 6, 7, 8, 9, 10],  # for every range
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],  # for every element
    [4, 2, 5, 4, 5, 6, 7, 8, 9, 10],  # for every second element
    [5, 5, 6, 6, 7, 8, 9, 10],  # for every