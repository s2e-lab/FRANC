
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if isinstance(text, str):
        return md5(text).hexdigest()
    elif isinstance(text, tuple):
        return md5(text).hexdigest()
    else:
        return None

#ifndef _ZSTR_H_
#define _ZSTR_H_
