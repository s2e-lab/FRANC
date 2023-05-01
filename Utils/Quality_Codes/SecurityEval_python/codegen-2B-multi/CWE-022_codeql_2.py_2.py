import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    tar_filename = str(file_name)
    with tarfile.open(tar_filename, "r:*" ) as tar_contents:
        for tar_info in tar_contents:
            print("Extracted " + tar_info.name)
            tar_file = tar_contents.extractfile(tar_info)
            with open("/tmp/" + tar_info.name, "wb")as output_file:
                output_file.write(tar_file.read())

