

def derivative(xs: list):
    """ xs represent coefficients of a polynomial.
    xs[0] + xs[1] * x + xs[2] * x^2 + ....
     Return derivative of this polynomial in the same form.
    >>> derivative([3, 1, 2, 4, 5])
    [1, 4, 12, 20]
    >>> derivative([1, 2, 3])
    [2, 6]
    """
    assert xs
    len_xs = len(xs)
    deriv = list(range(len_xs))
    deriv[0] = 1
    for idx in range(1, len_xs):
        idx_of_left_term = idx - 1
        diff = xs[idx]
        diff /= xs[idx_of_left_term]
        deriv[idx] = diff
    return deriv


