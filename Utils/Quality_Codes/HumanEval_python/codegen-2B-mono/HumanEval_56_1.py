

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
    # There are two ways that this function could be generalised for more brackets
    # The base approach is to check if a bracket is right by looking for an even number of opening brackets in its right neighbor,
    # and a one the closing bracket in its left neighbor. I would expect the last case to occur for strings of length 1, so
    # I would expect the resulting expression to evaluate to False
    brackets = brackets.replace("<", "#").replace(">", "#")
    for char in brackets:
        opening, closing = char == "(" or ")", "("
