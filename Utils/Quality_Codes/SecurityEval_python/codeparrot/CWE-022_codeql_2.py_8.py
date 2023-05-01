import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    
    tar_obj = tarfile.open(file_name, 'r:*')
    tar_obj.extractall(path=temp_dir)
    tar_obj.close()
    
    if not os.path.isdir('tmp'):
        os.mkdir('tmp')
    
    output_dir = 'tmp/tars'
    os.system('tar xvfd %s --directory="%s" -C %s/%s %s' % (
        tif_obj.names[-1],''.join(tif_obj.directories), output_dir, temp_dir, file_name
    ))