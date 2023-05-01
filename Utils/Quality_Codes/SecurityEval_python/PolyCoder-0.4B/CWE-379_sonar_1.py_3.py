import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''

    with tempfile.NamedTemporaryFile(suffix='.txt', mode='w', delete=True) as o:
        o.write(json.dumps(results, ensure_ascii=False))

    return o.name
