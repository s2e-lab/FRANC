import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    sock.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)  # No delay
    sock.settimeout(60)
    ssl_sock = ssl.wrap_socket(sock)
    ssl_sock.connect((host, port))
    print 'connected to:', host, port
    return ssl_sock


