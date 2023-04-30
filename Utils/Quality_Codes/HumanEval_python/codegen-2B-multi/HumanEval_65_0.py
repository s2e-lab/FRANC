
def circular_shift(x, shift):
    """Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circular_shift(12, 1)
    "21"
    >>> circular_shift(12, 2)
    "12"
    """
    s = "%s%s" % (('000000'[shift:][0:15]), x)
    res = bin(eval(base36_to_num(s)))[2:]
    res = res[:15 - shift]
    return(base36_to_num(res)) if len(res) < 15 else x[15 - shift:]


### Misc helper functions ###

