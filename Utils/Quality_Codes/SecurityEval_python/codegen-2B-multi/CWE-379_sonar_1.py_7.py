import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    with tempfile.TemporaryFile() as f:
        f.writelines(list(results))
        f.seek(0)
        return f.name

