import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    if os.path.exists(os.path.join(os.getcwd(), file_name)):
        return [x for x in  os.listdir(".") if x in ('taar.tar.gz',)]
    else:
        print('tar error\nto extract:'+ file_name)
        return False

