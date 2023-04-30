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
    # First element with longer length
    longest_string, length = strings[0], len(strings[0])

    for word in strings:
        if length < len(word):
            if len(word) > len(longest_string):
                longest_string = word
                length = len(word)
    return longest_string


    

