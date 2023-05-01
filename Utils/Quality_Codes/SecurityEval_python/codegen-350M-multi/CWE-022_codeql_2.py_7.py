import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    tar = tarfile.open(file_name)
    tar.extractall(tmpdir, recursive=True)
    tar.close()
    return (tar.getnames(), tar.getmembers())

