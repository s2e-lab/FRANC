import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    with tarfile.open(file_name) as f:
        f.extractall(path=os.path.join('/tmp'))
        print(f.getnames())

