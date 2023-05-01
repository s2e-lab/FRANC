import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    assert isinstance(results, str)
    if isinstance(results, unicode):
        return (results, '')
    else:
        return (results, _encode(results))


