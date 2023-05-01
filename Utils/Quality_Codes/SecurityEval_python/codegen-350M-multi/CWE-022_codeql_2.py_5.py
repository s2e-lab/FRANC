import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    f=tarfile.open(file_name)
    total_size=0
    # open each TAR entry - make sure you add any size for.extract()
    for i, tarinfo in enumerate(f): 
        # Get the tar's filename
        dest_file="/tmp/" + str(tarinfo.name)
        
        t=tarfile.TarFile(dest_file)
        for block_num in range(tarinfo.size):
            finfo=tarinfo.fp
            # Extract the contents to /tmp
            