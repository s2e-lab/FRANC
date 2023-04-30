from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """
    # concatenate('cat')
    # 'cat' + 'dog' + 'cat' + 'cow' + 'cat' + 'pig' 
    concat = ""
    for item in strings:
        concat += item
    return concat


