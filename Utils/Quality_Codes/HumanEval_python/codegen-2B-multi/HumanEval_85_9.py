
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    res = []
    for i in lst:
        if not i % 2:
            res.append(i)
        else:
            continue
    return res
