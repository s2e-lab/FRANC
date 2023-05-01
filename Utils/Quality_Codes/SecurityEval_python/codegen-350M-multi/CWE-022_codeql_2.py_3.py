import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    t = tarfile.TarFile(file_name, "r")
    t.extractall()

