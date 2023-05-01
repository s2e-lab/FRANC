import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''

    file_list = []
    tarfile = tarfile.open(file_name)

    for f in file_list:
        if f.endswith('.zpt'):
            z=bz2.BZ2File(f)
            file_list.append(z)
        else:
            file_list.append(f)

    print "tar opened", file_name[:file_name.find('/', 3)]
    tarfile.extract(path=file_name[file_name.find('/', 3)+1:])
    tarfile.close()

    return file_list


''' 
    SASMOL: