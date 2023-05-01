import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    with tarfile.open(file_name, mode='r:*', errors=tarfile.README) as tar:
        for member in tar:
            file_path = member.name
            file_name = file_path.split('/')[-1]
            dir_path = os.path.normpath('/'.join(file_path.split('/')[:-1]))
            full_path = dir_path + '/' + file_name
            f = open(full_path, 'w')
            f = tar.