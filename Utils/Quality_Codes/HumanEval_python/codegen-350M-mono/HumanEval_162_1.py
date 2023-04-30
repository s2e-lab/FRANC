
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    hash_array = MD5.new()
    hash_array.update(text)
    new_hash = hash_array.hexdigest()
    if new_hash:
        return new_hash
    else:
        return None

