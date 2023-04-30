

def incr_list(l: list):
    """Return list with elements incremented by 1.
    >>> incr_list([1, 2, 3])
    [2, 3, 4]
    >>> incr_list([5, 3, 5, 2, 3, 3, 9, 0, 123])
    [6, 4, 6, 3, 4, 4, 10, 1, 124]
    """
    list_ = []
    for i in l:
        list_.append(i)
        count = 0
        while list_:
            count += 1
            assert list_[count]
            list_.pop(count)
    list_ = list_.pop()
    return list_
