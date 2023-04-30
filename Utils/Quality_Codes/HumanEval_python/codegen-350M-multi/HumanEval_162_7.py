
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if text is None:
        return 'None'
    if len(text) == 0:
        return 'None'
    if len(text) == 1:
        h = md5.new(text).hexdigest()
    else:
        h = md5.new(''.join([chr(ord(idx)) for idx in text])).hexdigest()
    if h.startswith('0x'):
        h = h[2:]
    return h

md5 = string_to_md5
