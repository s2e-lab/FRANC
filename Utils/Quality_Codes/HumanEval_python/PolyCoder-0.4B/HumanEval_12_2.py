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
    len_string: Optional[str] = None
    for s in strings:
        if len_string is not None:
            return len_string

        next_len: int = len(s)
        if next_len == 0:
            continue
        if len_string is None:
           