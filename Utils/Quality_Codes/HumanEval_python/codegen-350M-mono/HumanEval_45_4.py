

def triangle_area(a, h):
    """Given length of a side and high return area for a triangle.
    >>> triangle_area(5, 3)
    7.5
    """
    assert is_real_number(a)
    assert is_real_number(h)

    if not a > 0 or not h > 0:
        raise ValueError(f'Areas must be positive. Passed values: {a}, {h}')

    return (1 / 3) * a * h
