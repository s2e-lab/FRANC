import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    print('Connecting to server...')
    return create_connection((host, port), None, ssl.PROTOCOL_TLSv1)
