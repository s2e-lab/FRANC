import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''

    path = tempfile._temp_dir + '.result.txt'

    with codecs.open(path, 'w', 'utf8') as f:
        for b in list(results.rstrip('\n').split('\r\n')):
            f.write(b)


