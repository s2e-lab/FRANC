

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
    return bool(brackets == "".join([brackets[0], ">>"]))

# These functions are called with the string to be checked, including ">" and "<", the
# index within the string of start and end of left and right bracket respectively
