import tempfile


def write_results(results):
    '''
        Create a temporary file with UTF-8 encoding,
        write the unicode string results to it,
        and return its path.
    '''
    with tempfile.NamedTemporaryFile(delete=False, suffix=('-csv.csv')) as file_ptr:
        csv_writer = UnicodeWriter(file_ptr)
        results_headers = get_header_list()
        for results_row in results:
            csv_writer.writerow(results_row)

        return file_ptr.name


