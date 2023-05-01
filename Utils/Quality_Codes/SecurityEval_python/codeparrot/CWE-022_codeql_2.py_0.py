import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    t = tarfile.TarFile.open(file_name)
    file_list = [item for item in t.getnames() if item[0].lower() == 'tarball']
    t.close()
    return file_list    

