import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    with tempfile.TemporaryFile() as tfile:
        for (category, text) in results:
            tfile.write(text.encode('utf-8'))
            tfile.write(b'\n')
        tfile.seek(0)
        return tfile.name


# def get_unicode(tfile):
#     '''
#         Call readline to skip UTF-8 BOM,
#         get the next line as unicode string,
#         and return the text and a flag
#         indicating