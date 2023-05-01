import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    ssl_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    ssl_socket.connect((host, port))
    return ssl_socket


