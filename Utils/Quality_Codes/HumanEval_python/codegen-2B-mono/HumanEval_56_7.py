

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
    if not brackets:
        return False

    index = 0
    while index < len(brackets):
        if brackets[index]!= ">" and brackets[index]!= "<":
            return False
        index += 1

    return True


# def find_parentheses_index(text: str, begin=0):
#     """ Find the index of the first closing bracket
#     that comes before the input text.
#     If there is no match a value of -1
#     will be returned.
#     """
#     index = iter(
