from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """
    result = ''
    if not strings:
        return result
    result += strings[0]
    for i in range(1, len(strings)):
        result += strings[i]
    return result


