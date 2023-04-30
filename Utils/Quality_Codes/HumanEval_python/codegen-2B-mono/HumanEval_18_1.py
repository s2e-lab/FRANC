

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    result = 0 
    string = "".join(string)
    substring = substring

    for index, letters in enumerate(string):
        if string.find(substring, index)!= -1:
            result += 1
    return result


