
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if text is None or len(text) == 0:
        return None
    if isinstance(text, bool):
        pass
    elif not isinstance(text, str):
        try:
            text = unicode(text)
        except Exception as e:
            # Not unicode
            pass
        text = text.lower().strip()
        text = md5.new(text).hexdigest()
        return text

    return hashlib.md5(text).hexdigest()
