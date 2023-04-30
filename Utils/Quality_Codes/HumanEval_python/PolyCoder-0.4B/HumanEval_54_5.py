

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

    s0, s1 = convert_chars(s0, s1)
    if s1 == 'e' or s1 == 'A' or s1 == 'I' or s1 =='s' or s1 == 'S' or \
       s1 == 'X' or s1 == 'D' or s1 == 'd' or s1 == 'F' or s1 == 'c' or \
       s1 == 'C' or s1 == 'z' or s1 ==