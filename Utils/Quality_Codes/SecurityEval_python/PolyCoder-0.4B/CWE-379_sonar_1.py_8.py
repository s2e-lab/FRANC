import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    results_path = tempfile.TemporaryDirectory()
    try:
        unicode_results = encode_unicode(results)
    except EncodingError:
        unicode_results = utf_7.encode(results)

    with open(results_path, "w") as f:
        f.write(unicode_results)
    return results_path


