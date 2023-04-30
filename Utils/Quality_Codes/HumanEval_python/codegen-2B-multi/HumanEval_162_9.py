
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    import hashlib
    hash_object = hashlib.md5()
    if "" is text:
        return None

    hash_object.update(text.encode('utf-8'))
    return '%s%s' % (hash_object.hexdigest(), hash_object.hexdigest())

