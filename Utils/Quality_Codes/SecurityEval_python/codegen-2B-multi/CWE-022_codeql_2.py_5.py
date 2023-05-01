import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    def _extract(tarinfo):
        file = open(tarinfo.name, 'wb')
        file.write(tarinfo.data)
        file.close()

    extracted_dirs = ''
    with tarfile.open(file_name, 'r') as tar:
        tar.extractall(path="tmp")

        # iterate the entries and call _extract()
        for tarinfo in tar:
            if tarinfo.isdir():
                # do nothing if it is a directory.
                # we only get here