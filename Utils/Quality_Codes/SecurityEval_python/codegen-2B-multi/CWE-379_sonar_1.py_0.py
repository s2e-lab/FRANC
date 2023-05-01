import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    with tempfile.TemporaryFile() as temp_file:
        for line in results:
            temp_file.write(line.encode('utf8'))
        temp_file.seek(0)
        return temp_file

