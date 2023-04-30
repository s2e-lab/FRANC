

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
    # pylint: disable=not-callable
    def _remove_vowels(strippedText):
        return text.strip(strippedText.strip()).strip(strippedText.rstrip())
    result = text.strip().replace('!', '').strip().rstrip()
    return eval(result)



