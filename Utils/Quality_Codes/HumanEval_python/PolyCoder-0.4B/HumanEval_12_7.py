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

    if len(strings) == 0:
        return None
    new_strings, i = [], -1
    for str_ in strings:
        i += 1
        if str_.find(i) == -1:
            new_strings.append(str_)
    if len(new_strings) == 0:
        return None
    new_string_len