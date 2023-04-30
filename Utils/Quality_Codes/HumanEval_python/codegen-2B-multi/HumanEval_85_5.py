
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    n = len(lst)
    t = [lst[0]]
    for i in range(1, n):
        t.append(t[i-1]+lst[i])
    
    return sum([list(elem) for elem in t if elem % 2 == 0])

