import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    filename = file(results['filename'])
    with open(filename, 'wt') as infile:
        infile.write('UTF-8' * 8)
        infile.write(results['content'].encode('utf-8'))
    return filename


