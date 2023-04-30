

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    assert len(string) > len(substring)    # substrings must be smaller than the original string
    if len(substring) == 0:
        return len(string) // len(substring) # No substring matches a set of empty (length = 0) substring and every char in
                                             # the string appears once.  That's not the case for empty sub strings.
    return (len(string) - len(substring) + 1)// len(substring) # We need to use // because Python does not add in front of an int