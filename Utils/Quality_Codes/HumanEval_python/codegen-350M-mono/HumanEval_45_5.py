

def triangle_area(a, h):
    """Given length of a side and high return area for a triangle.
    >>> triangle_area(5, 3)
    7.5
    """
    assert 0 <= a <= h, "The arguments must satisfy 0 <= a < h"
    return ((3.146 * a * h) / 2)  # formula from here: http://stackoverflow.com/questions/2359573/calculating-area-of-a-triangle-in-python

