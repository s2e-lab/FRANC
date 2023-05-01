import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''

    temp_file = tempfile.TemporaryFile()

    for line in results:
        temp_file.write(line.encode('utf8'))
        temp_file.write('\n')

    temp_file.flush()
    return temp_file.name

