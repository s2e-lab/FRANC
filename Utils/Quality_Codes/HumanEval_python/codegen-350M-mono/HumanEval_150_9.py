
def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """
    assert n!= 0
    # If n is a prime number
    if is_prime(n):
        return x
    else:
        # Else we should return the value y
        return y