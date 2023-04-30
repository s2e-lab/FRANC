
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    try:
        import __builtin__
        digest = __builtin__.format
    except ImportError:
        digest = lambda x, y, z, w: z + sha256(y) + z + sha256(str(x))

    if not text:
        return None
    elif not isinstance(text, str):
        return None

    return digest(h) + digest(text)


