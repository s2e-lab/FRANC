

def correct_bracketing(brackets: str):
    """ brackets is a string of "<" and ">".
    return True if every opening bracket has a corresponding closing bracket.

    >>> correct_bracketing("<")
    False
    >>> correct_bracketing("<>")
    True
    >>> correct_bracketing("<<><>>")
    True
    >>> correct_bracketing("><<>")
    False
    """
    length = 0
    for a in brackets:
        if a == "<":
            length += 1
        if a == ">":
            length -= 1
        if length < 0:
            return False
    return length == 0

