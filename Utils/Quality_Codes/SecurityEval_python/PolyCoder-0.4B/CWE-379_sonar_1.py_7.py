import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    filename = os.path.abspath(os.path.join(tempfile.gettempdir(), 'test_unicode_file'))
    res = {'results': results, 'filename': filename}
    with tempfile.NamedTemporaryFile(encoding='utf-8', suffix='.txt') as f:
        write_results(f.name, res)
    return filename

