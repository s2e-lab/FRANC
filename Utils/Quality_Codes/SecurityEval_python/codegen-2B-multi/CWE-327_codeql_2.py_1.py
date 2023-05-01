import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    # Connecting using SSL
    # Client certificate used to validate host name and the certificate
    # used by the server.
    ssl_sock = ssl.wrap_socket(sock)

    ssl_sock.connect((host, port))
    return sock


