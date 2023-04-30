from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """
    new_string = strings[0]
    for i in range(1, len(strings)):
        new_string += strings[i]
    return new_string


