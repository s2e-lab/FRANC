
def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """
    while n%2 == 0: x = x+ 1
    x = x * 2
    if n % 3 == 0: return x
    x = x * 3
    if n % 5 == 0: return x
    x = x * 5
    return x - y

