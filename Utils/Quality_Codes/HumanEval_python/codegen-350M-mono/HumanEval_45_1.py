

def triangle_area(a, h):
    """Given length of a side and high return area for a triangle.
    >>> triangle_area(5, 3)
    7.5
    """
    if a <= 0 or h <= 0:
        return 'enter non-negative inputs'
    return ((a**2) + (h**2) - (a*h))/2

