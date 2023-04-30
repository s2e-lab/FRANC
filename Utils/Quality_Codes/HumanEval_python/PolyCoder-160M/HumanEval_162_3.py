
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if text:
        text = text.strip()
        if 'a' == text.lower():
            return md5(text.split(b'')[1])
        else:
            return None
    else:
        return sha1(text.split(b'')[1]).hexdigest()

#!/usr/bin/env python
