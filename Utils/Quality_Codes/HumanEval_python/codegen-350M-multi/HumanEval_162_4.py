
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if not text:
        return ''
    if not isinstance(text, str):
        raise TypeError('Expected string!')

    def sha1sum():
        return hashlib.sha1(text).hexdigest()
    digest = sha1sum()[0:digest_len]
    return digest

