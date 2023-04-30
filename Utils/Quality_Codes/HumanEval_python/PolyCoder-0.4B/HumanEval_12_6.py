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
    result = list(map(len, strings))
    if len(result) == 1:
        return result[0]  # no need to check for null as it does not contain the last element, so this is the longest
    result = sorted(result, key=lambda s: min(len(s), len(s) - 1))
    return result[::-1]


