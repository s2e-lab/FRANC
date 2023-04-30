

def derivative(xs: list):
    """ xs represent coefficients of a polynomial.
    xs[0] + xs[1] * x + xs[2] * x^2 + ....
     Return derivative of this polynomial in the same form.
    >>> derivative([3, 1, 2, 4, 5])
    [1, 4, 12, 20]
    >>> derivative([1, 2, 3])
    [2, 6]
    """
    # initialize an empty list to store the values of the derivative of this polynomial
    derivatives = []
    # check if x1!= -1 (if x1 is not equal to -1, then calculate the derivative of y1_n)
    if x1!= -1:
        # calculate the x^n and the polynomial's derivative
        # yn(x) = a1 + (x - x1) * d_n(x)
        # yn(x) = y_n(x1) + (x - x1)