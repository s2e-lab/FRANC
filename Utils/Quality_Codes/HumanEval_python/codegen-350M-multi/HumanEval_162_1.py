
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if text == '': return None
    m = hashlib.md5()    # md5 is used so that the output stays the same.
    for character in text:
        m.update(character)
    return m.hexdigest()
