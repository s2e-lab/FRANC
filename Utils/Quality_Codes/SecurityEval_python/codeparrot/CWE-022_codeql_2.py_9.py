import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    f = tarfile.open(file_name)
    tf = tarfile.TarFile('.'+file_name,'r')

    for name in tf.getnames():
        if name.endswith('/'):
            tf.extract(name, tf)
        elif name.startswith('/'):
            tf.extract(name[:-1], tf)

    tf.close()
    print "Extracting tar file: ", file_name
    tf = tarfile.TarFile('.'+file_name)

    for name in tf.getnames():
        if name.endswith('/'):
            tf.extract(name, tf)

    f.extractall