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
    if not strings:
        return None

    longest_s = sum(1 for i in strings if i)
    # Find last one
    length = len(longest_s)
    if length == 0:
        length = len([s for s in strings if s[0]])
    if length == 0:
        return None

    next_s = longest_s[0]
    result = []