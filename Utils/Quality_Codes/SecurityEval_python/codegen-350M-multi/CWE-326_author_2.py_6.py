from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    print('importing key from pem format file')
    pem_formula = open('openssh-generated_publickey.pem')
    pem_publickey = pem_formula.read()
    pem_publickey = pem_publickey.replace(" \n",'').replace("\r",'').replace("\n", '').replace("\r",'').replace('"','').replace('\t','').replace('\x00','')
    pem_publickey = pem_publickey.replace