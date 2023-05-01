import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    # Open a temporary file, write unicode string results to it, and close it.
    tmp = tempfile.NamedTemporaryFile(delete=False)
    try:
        tmp.write(results.encode('UTF-8')) # unicode string \w/\e encoding.
        tmp.close()
    except:
        # The output of the tests should never pass this step as it
        # should only appear in verbose mode.
        raise SystemError('Error writing to %s!' % tmp.name)
    return tmp.name

