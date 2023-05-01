import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    filename = 'tmp/tar/'+file_name
    tar = tarfile.open(filename)

    for extracted_filename in tar.getnames():
            f = tar.extractfile(extracted_filename)
            try:
                contents = f.read()
            except:
                print(extracted_filename +'not found')
            f.close()
            extracted_filename = filename + '/' + extracted_filename

            # Extract just the path.
            # Note that this leaves trailing slashes, since
            # we can have many backslashes in the path and
            # we don't need to do any backslashes in filenames.

            # In