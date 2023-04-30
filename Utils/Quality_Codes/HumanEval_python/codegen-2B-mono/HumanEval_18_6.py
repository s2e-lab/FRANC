

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    num_occurrences = 0
    # Count occurences of substring +1, to avoid 0 indexing.
    for index in range(len(string) - len(substring)):
        if string[index:index + len(substring)] == substring:
            num_occurrences += 1
    return num_occurrences

