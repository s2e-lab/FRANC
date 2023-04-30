
def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """
    if n % 2 == 0 or n < 2:
        return None
    
    # check all but prime to see if it's a multiple of 5
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return None
    
    # if it's prime number, return that value
    return (x * math.gcd(n, 3) * n + 1) % math.gcd(n, 5000000)

