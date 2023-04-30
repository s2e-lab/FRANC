

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
    # remove whitespace and comment
    text = remove_and_trim_whitespace(text)
    text = text.replace('\n', " ")
    text = text.replace('\r', "")
    text = text.replace('\t', "")
    text = text.replace(' ', '-')
    return text


