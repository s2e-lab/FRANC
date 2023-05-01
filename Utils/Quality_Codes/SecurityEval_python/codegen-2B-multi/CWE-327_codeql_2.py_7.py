import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    sock.setsockopt(socket.IPPROTO_TCP,socket.TCP_NODELAY,1)
    sock = ssl.wrap_socket(sock, ca_certs="/opt/netdna/ssl/localhost.pem", cert_reqs=ssl.CERT_NONE)
    # connect with the client socket
    sock.connect((host, port))
    return sock

