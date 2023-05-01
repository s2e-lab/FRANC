import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    tmp_dir = "{0}/tmp".format(os.path.join(basedir, "tmp"))
    tar = tarfile.open(file_name, "r:")
    for name in tar.getnames():
        tmp_dir = "{0}/{1}".format(tmp_dir, name)
        if os.path.exists(tmp_dir):
            logger.debug("Using {}".format(tmp_dir))
            logger.debug("Extracting from {}".format(os.path.abspath(