
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
    if isinstance(a, np.ndarray):
        b = len(a)
        try:
            return False
        except:
            return True
    if isinstance(a, list):
        b = len(a)
        b_len = len(a)
        return True
  