import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    tar = tarfile.open(file_name)
    
    for entry in tar:
        if entry.name[-4:]!= ".tar":
            continue

        filename = os.path.join(entry.name, entry.name[:-4])

        with open(filename, 'rb') as reader:
            file_contents = io.BytesIO(reader.read())
            tarinfo = tar.extractfile(entry)

            return_value = io.BytesIO()
            for block in tarinfo.iterdir():
                if is