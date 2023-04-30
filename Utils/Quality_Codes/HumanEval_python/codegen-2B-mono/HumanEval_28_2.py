from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """
    if strings == []:
        return ''
    return strings[0] + concatenate(strings[1:])

# Alternative
# def concatenate(strings):
#     return "".join(words)

# print(concatenate(["h", "e", "l", "l", "o"]))


