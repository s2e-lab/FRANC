from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    s = socket(AF_INET, SOCK_STREAM)
    s.bind(('localhost', port))
    s.listen()
    conn, addr = s.accept()
    # TODO set the message as in the message file
    data = conn.recv(1024)
    conn.send(data)

