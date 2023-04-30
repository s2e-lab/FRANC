
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if len(text) == 0:
        return None

    md5_content = text.encode('utf-8')

    # Strip all spaces, like it could be here
    result = ''

    for i in range(0, len(text), 2):
        if (i + 1) < len(md5_content):
            result += md5_content[i: i + 2]
 