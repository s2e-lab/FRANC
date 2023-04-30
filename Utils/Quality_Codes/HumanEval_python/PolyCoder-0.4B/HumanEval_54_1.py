

def same_chars(s0: str, s1: str):
    """
    Check if two words have the same characters.
    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc')
    True
    >>> same_chars('abcd', 'dddddddabc')
    True
    >>> same_chars('dddddddabc', 'abcd')
    True
    >>> same_chars('eabcd', 'dddddddabc')
    False
    >>> same_chars('abcd', 'dddddddabce')
    False
    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddddabc')
    False
    """
    if not isinstance(s0, str):
        return False  # Not an expression.
    if not isinstance(s1, str):
        return False  # Not an expression.

    if s0.lower() and not s1.lower():
        return True  # If there are no non-matching characters, then this
        #              will mean that there is no point in