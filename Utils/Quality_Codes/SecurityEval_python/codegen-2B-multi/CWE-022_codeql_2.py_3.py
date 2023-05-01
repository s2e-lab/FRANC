import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    with tarfile.open(file_name, 'r') as tar:
        for tar_entry in tar:
            path = os.path.join(os.getcwd() + '/../', '..','resources')
            print(os.path.join(os.getcwd(), '../','resources', tar_entry.name.split('/')[1]))
            tar_entry.extractall(path)
            #tar_entry.extract(path)

