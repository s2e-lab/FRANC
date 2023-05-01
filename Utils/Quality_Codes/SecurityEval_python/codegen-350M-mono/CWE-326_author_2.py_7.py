from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''

    msg = "Nom : \"%s\" \nAdresse : \"%s\",\nEmail : \"%s\",\nTelephone : \"%s\"" % \
           ("Adresse", "nom@email.com", "email@gmail.com", "Telephone_number")

    key = DSA.generate(2048)
    private_key = key.export_key(format='OpenSSH')

    return private_key

