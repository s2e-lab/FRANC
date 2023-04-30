
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    # TODO(alashan): This should only compare strings, not hex strings.
    if not text:
        return None

    if len(text) < 64:
        return hex_hash(text)
    return'md5(' + hex_hash(text) + ')'

