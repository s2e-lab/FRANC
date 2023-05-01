import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    if not os.path.exists(file_name):
        fileid = os.rename(file_name, file_name + '.tar')
    else:
        fileid = tarfile.open(file_name)

    for tarinfo in fileid.getmembers():
        name = tarinfo.linkname
        if not name:
            name = tarinfo.name
        file_id = name + '_' + tarinfo.linkname
        filename = fileid.extractfile(name)

        # Extract the contents of the tar