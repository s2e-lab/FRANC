
def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """
      
    if n==0:
        return y

    if n&1:
        return x
    
    x1 = x
    y1 = y
    
    x = x1

    while n%2:
        x = (x*x1) % n
        y1 = (y1*y1) % n
        x1 = (x1*x) % n
        n = n + 2
    
    x1 = (x*x1) % n
    y1 = (y1*y1) % n
