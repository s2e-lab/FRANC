import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    return (create(socket.AF_INET, socket.SOCK_STREAM), host, port,
            create(socket.IPPROTO_TCP, ssl.PROTOCOL_TLS, ssl.CERT_NONE))


