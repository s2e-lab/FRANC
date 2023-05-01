from Crypto.Cipher import *


def send_encrypted(secret_key, channel, message):
    '''
    Encrypt the message after creating a cipher,
    and send it over the channel passed as parameter.
    '''
    cipher_text = '\n' + str(channel) + '\n' + str(message) + '\n' + str(cipher_text) + '\n' + str(cipher_text) + '\n' + str(cipher_text) + '\n\n\n\n\n\n\n\n\n\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''