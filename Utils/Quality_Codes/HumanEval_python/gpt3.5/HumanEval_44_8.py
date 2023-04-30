

def change_base(x: int, base: int) -> str:
    """
    Convert a number from decimal to a given base.
    :param x: decimal number to be converted.
    :param base: the desired base.
    :return: a string containing the number in the desired base.
    """
    
    assert 2 <= base <= 9, "Base must be between 2 and 9."
    
    result = ""
    
    while x > 0:
        remainder = x % base
        result = str(remainder) + result
        x //= base
        
    return result
