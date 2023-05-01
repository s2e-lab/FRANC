import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    with tarfile.open(file_name) as tar:
            for member in tar:
                path = os.path.join("/tmp/", member.name)
                if member.isreg(): 
                    print 'extracting',  member.name
                    # member.size gives size in bytes
                    with open(path, 'wb') as out:
                        out.write(member.read(member.size))
                elif member.isdir():
                    print "extracting directory", member.name
                    try:
                        os.m