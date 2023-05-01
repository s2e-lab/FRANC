import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    tempfile_path = tempfile.mktemp()

    try:
        with open(tempfile_path, 'wb'):
            results.write(tempfile_path, encoding='UTF-8')
        return tempfile_path
    finally:
        try:
            os.remove(tempfile_path)
        except (ImportError,