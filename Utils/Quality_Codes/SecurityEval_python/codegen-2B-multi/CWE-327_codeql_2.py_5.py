import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    if hasattr(socket, '_GLOBAL_DEFAULT_TIMEOUT'):
        try:
            if hasattr(socket.create_connection, '__call__'):
                timeout = socket._GLOBAL_DEFAULT_TIMEOUT
            else:
                timeout = socket.getdefaulttimeout()
        except AttributeError:
            # python 2.7 has a create_connection function, but does not have
            # getdefaulttimeout
            