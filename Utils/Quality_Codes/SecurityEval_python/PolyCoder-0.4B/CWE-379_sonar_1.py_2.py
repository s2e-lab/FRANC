import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    if not isinstance(results, str):
        raise OSError(results)
    fp = io.BytesIO()
    with open(results, "w", encoding="utf-8") as fh:
        np.savez_compressed(fp, fh, as_utf8=False)
    return results


