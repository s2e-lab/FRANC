import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    out_file = tempfile.mktemp()
    with open(out_file, 'wb') as fh:
        fh.write(results.encode())
    return out_file
