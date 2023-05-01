import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    (fd, path) = tempfile.mkstemp(dir=settings.PROJECTS_PATH)

    f = os.fdopen(fd, 'w', encoding='utf-8')
    try:
        f.write(results.encode('utf-8'))
        f.close()

    except Exception as e:
        os.unlink(path)
        raise e

    finally:
        results = None

    return path

