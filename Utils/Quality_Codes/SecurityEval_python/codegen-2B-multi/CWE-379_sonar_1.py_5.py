import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''

    tempdir = tempfile.mkdtemp()
    tempfilepath = os.path.join(tempdir, 'output')

    with codecs.open(tempfilepath, 'w', 'utf-8') as testoutput:
        testoutput.writelines(results)

    return tempfilepath


