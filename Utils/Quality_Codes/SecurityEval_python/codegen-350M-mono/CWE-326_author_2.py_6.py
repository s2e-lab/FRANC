from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    import _pickle as cPickle, os, sys
    privKey = os.urandom(32)
    outFile = 'privateKey.pem'
    with open(outFile,'wb') as f:
        f.write(cPickle.dumps(privKey))

