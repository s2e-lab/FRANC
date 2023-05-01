import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    with tarfile.open(file_name,  mode='r') as tarball:
        for tar_info in tarball:
            # Extract only files, not directories
            if tar_info.isdir():
                continue
            file_name = os.path.join(os.getcwd(), "tmp", tar_info.name)
            with open(file_name, "wb") as extracted:
                extracted.write(tarball.extractfile(tar_info).read())
