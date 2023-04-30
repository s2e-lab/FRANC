

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
    bracket_map = {">": "<", "<": ">", "[": "]", "]": "["}
    open_count = 0
    for i in range(len(brackets)):
        parsed_bracket = bracket_map.get(brackets[i])
        if parsed_bracket:
            open_count += 1
        if brackets[i] == parsed_bracket:
            open_count -= 1
            if open_count < 0:
                return False
    return True


a = ['>()<', '