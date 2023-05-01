import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    tar_tar = tarfile.open(file_name)
    for tar_entry in tar_tar:
        fileName = os.path.join(
            tar_entry.name, 
            tar_entry.name.replace(
                '.'+".tar.gz", 
                "file.tar.gz"
            )
        )
        t = open(fileName, 'rb')
        contents = t.read()
        t.close()

        tar_entry.size = len(contents)
        tar_entry.