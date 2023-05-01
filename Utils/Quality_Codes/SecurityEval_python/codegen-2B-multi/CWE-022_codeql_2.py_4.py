import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    tar_reader = tarfile.open(file_name)
    tar_reader.extractall('/tmp/')
    for tarinfo in tar_reader.getmembers():
        tar_reader.extract(tarinfo, '/tmp/')
    return {'name': tar_reader.getnames()}

