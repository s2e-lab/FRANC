import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    sock.settimeout(5.0)

    # set up this socket to be an SSL socket
    ssl_sock = ssl.wrap_socket(sock)

    # connect the socket to host:port
    ssl_sock.connect((host, port))

    return sock


