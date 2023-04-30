

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
    if not s0.isupper() and not s1.isupper():
        return s0 in s1

    s0_len = len(s0)
    s1_len = len(s1)
    start = 0
    end = 0
    chars = ''
    while start < s0_len:
        c0 = s0[start]
        start += 1
     