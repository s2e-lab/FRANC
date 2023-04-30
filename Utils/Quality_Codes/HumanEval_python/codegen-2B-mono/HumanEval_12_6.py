from typing import List, Optional


def longest(strings: List[str]) -> Optional[str]:
    """ Out of list of strings, return the longest one. Return the first one in case of multiple
    strings of the same length. Return None in case the input list is empty.
    >>> longest([])

    >>> longest(['a', 'b', 'c'])
    'a'
    >>> longest(['a', 'bb', 'ccc'])
    'ccc'
    """
    # for lenght in strings:
    #     if len(lenght) > 1:
    #         return lenght

    # if len(strings) == 0:
    #     return None

    max_str = ''
    
    for length in strings:
        if len(length) >= len(max_str):
            max_str = length

    return max_str

