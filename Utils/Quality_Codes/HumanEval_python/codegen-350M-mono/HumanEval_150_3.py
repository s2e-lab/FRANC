
def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """
    #print('x_or_y:  %d' %x_or_y(n, x, y))
    for i in range(2, 10001):
        if x_or_y(n, i, y)==i:
            return i

