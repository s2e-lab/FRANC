
def compare_one(a, b):
    """
    Create a function that takes integers, floats, or strings representing
    real numbers, and returns the larger variable in its given variable type.
    Return None if the values are equal.
    Note: If a real number is represented as a string, the floating point might be . or ,

    compare_one(1, 2.5) ➞ 2.5
    compare_one(1, "2,3") ➞ "2,3"
    compare_one("5,1", "6") ➞ "6"
    compare_one("1", 1) ➞ None
    """
    if a is None:
        return b
    elif isinstance(a, int) or isinstance(a, bool):
        return a
    elif isinstance(a, float):
        return a
    elif isinstance(a, str) and ("?" in a) and ("&" in a):
        return a
    else:
        return str(a)


def create_file_