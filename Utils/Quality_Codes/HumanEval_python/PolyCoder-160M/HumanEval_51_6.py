

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
    # TODO: make this class a singleton
    def add_empty(value):
        return text.rstrip() + value
    def remove(text):
        """removed text: returns removed text and removes all vowels"""
        textstr = remove_vowels(text)
        textstr = remove_vowels(txt = textstr)
        if textstr == text:
   