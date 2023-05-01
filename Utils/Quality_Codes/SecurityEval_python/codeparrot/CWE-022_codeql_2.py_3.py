import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    
    tar = tarfile.open(file_name)
    for entry in tar:
        tar_info = tar.gettarinfo(entry)
        tar_info.name = entry.name
        tar_info.mode = entry.mode
        tar_info.mtime = entry.mtime
        tar_info.uid = entry.uid
        tar_info.gid = entry.gid
        try:
            tar_info.uname = entry.uname
        except AttributeError:
            tar_info.uname = "root"
        try:
            tar_info.gname = entry.gname
        except AttributeError:
            tar_