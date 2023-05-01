import tarfile

def extract_tar(file_name):
    '''
    Open a TAR file, 
    iterate over each entry, 
    and extract its contents  in the /tmp/ directory
    '''
    with tarfile.open(file_name, 'r') as tar:
        for item in tar:
            filename = item.name.split('/')[-1]
            #print filename
            if filename.endswith('/vnts/test.tar'):
                #print 'file already extracted'
                pass
            elif filename.endswith('/vnts/test/'):
                #print 'extracting file:'+ filename
                extracted_name = os.path.join('/tmp/vnts', filename)
                #print extracted_name
                tar.extract(extracted_name, path=item.name)
            elif filename.