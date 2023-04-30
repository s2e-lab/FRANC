

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    string_length = len(string)
    count = 0
    for i in range(string_length):
        if i + len(substring) <= string_length and string[i] == substring[0]:
            j = 1
            while i + j < string_length and string[i + j] == substring[j]:
                j += 1
            count += j - 1
    return count

