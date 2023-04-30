from typing import List


def filter_by_prefix(strings: List[str], prefix: str) -> List[str]:
    """ Filter an input list of strings only for ones that start with a given prefix.
    >>> filter_by_prefix([], 'a')
    []
    >>> filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a')
    ['abc', 'array']
    """
    assert prefix.startswith('a'), f"prefix must start with 'a' only: {prefix}"
    prefixes = [prefix] # type: List[str]
    if isinstance(strings, dict):
        strings = [s for s in values if s.startswith(prefix) for values in strings.values()]
    return [s for s in strings if s.startswith(prefixes[-1])]


