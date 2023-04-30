from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """
    if not strings:
        return ''
    s = ''
    # print(strings[0])
    # print(len(strings))
    count = 0
    result = ''
    while len(s) < len(strings):
        if count > 0:
            result += string
        try:
            result += strings[