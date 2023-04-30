

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    string = lower(string)
    substring = lower(substring)
    n = 0
    i = 0
    while True:
        try:
            i = string.index(substring, i)
            # increment counter by 1 if match found
            if substring in string[max(0, i - 5):i]:
                n += 1
            i += len(substring)
        except ValueError:
            # end of string
            break
    return n

