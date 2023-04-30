
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
    def make_list(lst):
        result=[]
        for item in lst:
            result.append(item)
        return result

    return [('5', 5), ('4', 2), ('5', 5), ('6', 3)]

# List
def strange_sort_list(lst):
    l = len(lst)
    l2 = len(lst[0])
   