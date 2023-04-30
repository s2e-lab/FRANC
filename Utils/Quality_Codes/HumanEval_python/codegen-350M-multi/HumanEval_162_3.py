
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """
    if not text:
        return None
    if len(text) == 0:
        return None

    try:
        digest = hashes.hashobj(hash_alg=hashes.sha256, key=hashlib.sha256(text).digest())
    except ValueError:
        for line in text.splitlines():
            if line:
                if not line.startswith('        '):
                    # strip all whitespace in the line (after 2-2 space)
                    line = line.strip()
                else:
                    pass
                