import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    tf = tarfile.open(name_of_file)

    for entry in tf:
        with open(entry, 'rb') as infile:
            tar_bytes = infile.read() 
            if entry == tar_bytes:
            
                tf.extract_archive(entry)
                entry_count = 1
            else:

                tf.extract_file(entry[entry_count]) 
                entry_count += 1

    return tf

