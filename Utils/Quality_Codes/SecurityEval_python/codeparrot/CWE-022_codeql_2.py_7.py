import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    tmp_dir = os.path.dirname(os.path.realpath(__file__))
    tar = tarfile.open("%s.tar" % tmp_dir, "r:gz")
    tar.extractall(tmp_dir)
    return_list = []
    for item in tar:
        if item.isfile() and item.path.endswith("/tmp/"):
            if os.path.isfile(item.path): 
                with open(item.path, "r") as f:
                    for e in f.readlines():
                        if e.startswith("dlink") or e.startswith("http://