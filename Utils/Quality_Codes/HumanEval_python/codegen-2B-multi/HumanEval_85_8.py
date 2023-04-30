
def add(lst):
    """Given a non-empty list of integers lst. add the even elements that are at odd indices..


    Examples:
        add([4, 2, 6, 7]) ==> 2 
    """
    while lst:
        a = lst[-1]
        if a % 2:
            m = a + a
            for n in lst[::-1]:
                if n % 2:
                    break
                else:
                    tmp = a+n
                    # lst.append(tmp)
                    a = tmp
            lst.pop()
        else:
            break
    return lst

