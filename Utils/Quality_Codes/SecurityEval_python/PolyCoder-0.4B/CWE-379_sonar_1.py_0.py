import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    if sys.stdout.isatty():
        return

    print >> sys.stderr, sys.mypy_compiler_version()

    with tempfile.NamedTemporaryFile('wb', encoding=utf8) as temp:
        for result in results:
            result.write(temp.name)
        os.fsync(temp.name)

        save_text(temp