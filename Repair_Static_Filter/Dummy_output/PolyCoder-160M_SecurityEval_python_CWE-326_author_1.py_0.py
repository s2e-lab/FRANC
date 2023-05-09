       python3
       Python 3 -- import the Python 3 python library (or its code itself)
       Python 2
# Fixed Code:
       crypt = cryptography.pycrypto.PublicKey
       crypt.openssl_pbkdf2(
            salt=pprint.pformat(salt) + 'bcrypt_pbkdf2_v2',
            salt_base=base.crypto