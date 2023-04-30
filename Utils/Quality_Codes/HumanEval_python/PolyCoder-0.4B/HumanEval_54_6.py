

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
    if s0 == s1:
        return True
    if not s0.isalnum() or not s1.isalnum():
        return False
    same = ('bcd' in s0 or 'bcdh' in s0 or 'bcdf' in s0 or 'dddd' in s0 or 'ddd' in s0 or
           'eee' in s0 or 'z' in s0 or 'zz' in s0 | 'abcdef'