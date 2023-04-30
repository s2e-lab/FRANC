

def remove_vowels(text):
    """
    remove_vowels is a function that takes string and returns string without vowels.
    >>> remove_vowels('')
    ''
    >>> remove_vowels("abcdef\nghijklm")
    'bcdf\nghjklm'
    >>> remove_vowels('abcdef')
    'bcdf'
    >>> remove_vowels('aaaaa')
    ''
    >>> remove_vowels('aaBAA')
    'B'
    >>> remove_vowels('zbcd')
    'zbcd'
    """
    # a string, so just strip off'and doubled '
    text = text.strip()
    # remove any space or newline
    text = '\r\n' if isinstance(text, basestring) else text
    # remove the first or last char except for \n, if present, remove it (with trailing doubled chars)
    text = list(remove_vowels(list(text)[1:-1]).strip())
    if len(text) == 1:
      