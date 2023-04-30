

def derivative(xs: list):
    """ xs represent coefficients of a polynomial.
    xs[0] + xs[1] * x + xs[2] * x^2 + ....
     Return derivative of this polynomial in the same form.
    >>> derivative([3, 1, 2, 4, 5])
    [1, 4, 12, 20]
    >>> derivative([1, 2, 3])
    [2, 6]
    """
    dxs = []
    for i in range(0, len(xs)):
            if i - 2 >= 0 and i + 1 < len(xs):
                dxs.append(-xs[i] * (i - 1))
            else:
                dxs.append(0)
    return dxs

