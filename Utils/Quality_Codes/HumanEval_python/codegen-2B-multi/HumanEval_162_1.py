
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if text and not isinstance(text, basestring):
        raise TypeError('text must be a string. type(text) = "%s"' % type(text))

    m = hashlib.md5()

    # The following is taken from:
    #   http://code.activestate.com/recipes/511415-unicode-and-string-encoding/
    #   except for the string version of hashlib.md5
    if not isinstance(text, unicode):
        text = unicode(text)
    m.