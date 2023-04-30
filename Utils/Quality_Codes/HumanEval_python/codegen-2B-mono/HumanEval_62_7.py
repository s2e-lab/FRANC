

def derivative(xs: list):
    """ xs represent coefficients of a polynomial.
    xs[0] + xs[1] * x + xs[2] * x^2 + ....
     Return derivative of this polynomial in the same form.
    >>> derivative([3, 1, 2, 4, 5])
    [1, 4, 12, 20]
    >>> derivative([1, 2, 3])
    [2, 6]
    """
    degree = len(xs)
    result = []
    i = 0
    while i < degree - 1:
        sum = 0.
        while i in range(degree - 1) and i < degree:
            sum += float(xs[i]) * float(i)
            i += 1
        result.append(sum)
        i += 1
    return result

