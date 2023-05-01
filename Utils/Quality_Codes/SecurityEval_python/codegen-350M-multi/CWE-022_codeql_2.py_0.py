import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    
    if file_name.endswith('tape'):
        file_name = 'tmp/' + file_name
    
    file_name_dir = file_name + '.tmp'
    
    with tarfile.open(file_name, mode='r:*') as tar:
        for level in reversed(range(2, tarfile.getnames())):
            path = os.path.join(str(level), file_name_dir)
            if tar.is_tarfile(path):
                for entry in tar: