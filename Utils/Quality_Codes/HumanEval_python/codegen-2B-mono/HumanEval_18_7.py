

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    n, m = len(string), len(substring)
    times = 0
    for s in range(n-m+1):
        if substring == string[s:s+m]:
            times += 1
    return times

