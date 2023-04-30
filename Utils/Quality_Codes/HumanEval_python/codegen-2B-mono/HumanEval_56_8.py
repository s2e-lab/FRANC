

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
    count = 0
    for bracket in brackets:
        assert bracket == '<' or bracket == '>'
        if bracket == '<':
            count += 1
        else:
            count -= 1
        if count < 0:
            return False
    return count == 0



## Code for question 5
