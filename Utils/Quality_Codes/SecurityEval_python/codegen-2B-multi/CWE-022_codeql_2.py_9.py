import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    tmp  = tarfile.open(file_name, encoding="iso8859-1")
    tmpname = tmp.next()
    while (tmpname is not None):
        tmpname.name = os.path.join(str(tmpname.name),"/tmp")
        tmp.extract(tmpname,'/tmp')  
        tmpname = tmp.next()
    # for filename in tmp.getnames():
    #     print(filename)
    tmp.close()
