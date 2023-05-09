from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    # This can be changed.  I don't think it looks.  It could be
    # added as a result of a 'get_private_key' error, but I have a
    # potential to make your code more tolerant of issues in the 
    # implementation.

    # This is a fixed amount of code that is incredibly conceivable to
    # simplify the change with pyCrypto libraries.  I guess it's a
    # bad idea to redefine an implementation with pyca/