
def iscube(a):
    '''
    Write a function that takes an integer a and returns True 
    if this ingeger is a cube of some integer number.
    Note: you may assume the input is always valid.
    Examples:
    iscube(1) ==> True
    iscube(2) ==> False
    iscube(-1) ==> True
    iscube(64) ==> True
    iscube(0) ==> True
    iscube(180) ==> False
    '''
    try:
        # Check for int or integer or cube pairs
        if a == 2 and isquad(a) or isquad(a-1) and isint(a):
            return True
        if not iscube(a):
            return False
    except TypeError:
        return isint(a) and False


if __name__ ==