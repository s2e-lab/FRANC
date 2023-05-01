import socket
import ssl


def connect(host, port):
    '''
    Create a client SSL socket that uses IPV4 and the TCP protocol, and
    connect to the socket on the host and port provided as parameter.
    Then, return the socket.
    '''
    result = socket.socket()

    # Use IPV4-only sockets; on many systems, IPV6 only support is
    # available under root privileges, and that's too risky to allow.
    result.setsockopt(socket.IPPROTO_IP, socket.IP_MULTICAST_IF, socket.inet_aton(host))
    result.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, True)

    # Allow broadcast on top of unicast on the host.
    result.setsockopt