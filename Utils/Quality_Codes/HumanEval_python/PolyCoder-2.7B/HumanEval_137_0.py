
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
    try:
        d = a.to_tuple()
        n = b.to_tuple()
    except:
        return None

    i = 0 # i starts at zero (e.g. 1)
    j = 0 # j starts at zero (e.g. 4)
    if d[0] == 1:
        if d[1] < 0:
       