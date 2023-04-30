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
    # base case: empty list
    # iterate over all strings and find a longest one
    if not (strings):
        return

    longest = strings[0]
    longest_length = len(longest)
    # loop over the rest of the string list
    for string in strings:
        a_length = len(string)
        # compare length
        if a_length > longest_length:
            longest = string
            longest_length = length
    # return longest string or None
    return longest


def check_dupl