import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    fname = tempfile.mktemp()
    with io.open(fname, 'wb') as f:
        f.write(results['raw'])
        f.close()
    return fname


