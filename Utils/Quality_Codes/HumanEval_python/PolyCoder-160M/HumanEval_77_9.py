
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
    if(a>0):
        a=int(a)
        assert(a>1 or a<0)
    else:
        a=1
    assert(a>=1 or a < 10000)
    return a>>5    # the minimum cube should never be less than 100 to fit the given value


