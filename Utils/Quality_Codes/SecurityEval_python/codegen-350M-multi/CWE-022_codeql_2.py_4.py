import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    # Use TarBuffer so the file name could be in a different folder after 
    # uncompress
    tar = tarfile.Open(file_name, 'r:*')
    tar_info = tar.next()
    for path in pkg_resources.resource_filename('sikuli.utils.installer', os.path.dirname(file_name)):
        path = pkg_resources.resource_filename('sikuli.utils.installer', os.path.basename(path))
        for buffer in tar.extract(path