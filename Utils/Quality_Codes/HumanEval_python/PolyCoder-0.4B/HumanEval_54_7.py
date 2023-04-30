

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
    return bool(s0) and bool(s1)


#
# This dictionary must cover all the different language tag
# cases with different unicode chars.
# These are not the same types of characters as the ones from the
# spec, but rather are as follows:
#
# - If the chars do not match in both the same form, it's not
#   allowed to be in the same format.
# - If the chars do match, and we get the opposite case, then we
#   must match exactly.
#
# The string '