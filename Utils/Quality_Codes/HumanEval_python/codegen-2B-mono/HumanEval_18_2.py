

def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """
    count = 0
    # find the index of the substring
    index = string.find(substring)
    while index!= -1:
        count += 1
        # find the next position of substring in the string
        # until get back to the index and compare
        string_new = string[index:]
        # find the start of substring in the string_new
        index_new = string_new.find(substring)
        # check the starting index_1 is equal to index
        # while still substring still in the string_new
