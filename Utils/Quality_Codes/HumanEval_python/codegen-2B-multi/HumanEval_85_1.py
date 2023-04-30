
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    i = 0
    for eli in reversed(lst):
        if i % 2 == 1:
            lst[i] = lst[i] + eli
            i += 1
            continue
        else:
            lst[i] = eli
            i += 1

    return lst
