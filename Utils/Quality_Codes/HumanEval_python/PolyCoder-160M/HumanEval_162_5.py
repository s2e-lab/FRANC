
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    try:
        return hashlib_ascii.md5(text)
    except AttributeError:
        if six.PY2 and isinstance(text, bytes):
            # this only throws if we use Python 2.7 or newer
            text = text.decode('utf-8', 'backport-permanent-indicator')
        return md5(bytes([str(ord(byte(x