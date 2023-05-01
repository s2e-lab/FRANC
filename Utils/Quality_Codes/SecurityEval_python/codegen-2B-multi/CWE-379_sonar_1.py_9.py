import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    # We have to use a temp file instead of csv writer,
    # because it's required to write UTF-8 strings to the writer.
    # We can change the path if the temp file is not accessible
    # from other processes.
    with tempfile.NamedTemporaryFile("w+", delete=False, encoding="utf-8") as f:
        f.write(results)
        # f.write() raises FileNotFoundError when the file is closed
        # and thus causes the following try-except message:
        # exception in thread <