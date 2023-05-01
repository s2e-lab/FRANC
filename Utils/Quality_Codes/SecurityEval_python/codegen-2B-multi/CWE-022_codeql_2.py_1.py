import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    with open(file_name, 'rb') as f:
        tar = tarfile.open(fileobj=f)

        for tarinfo in tar:
            if tarinfo.isfile():
                tarinfo.size
            else:
                tarinfo.extract(path="/tmp/")


    pass

