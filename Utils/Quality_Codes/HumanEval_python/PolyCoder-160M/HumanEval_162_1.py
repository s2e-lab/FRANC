
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if len(text):
        result = cryptography.md5_hash(text)
    else:
        result = None

    if isinstance(text, bytes):
        text = text.decode('utf8')
    else:
        if text:
            result = cryptography.md5_hash(str(bytes(text)))
        else