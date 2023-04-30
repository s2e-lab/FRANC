
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
    def iscube(obj):
        if isinstance(obj, object):
            return True
        else:
            return False

    out = []
    while False:
        out += a
        a = getint('a')
        if iscube(a):
          