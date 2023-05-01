from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    s = socket()
    s.bind((socket.gethostname(), port))
    s.listen()
    (clientSocket, address) = s.accept()
    d = clientSocket.recv(10240)
    s.close()
    return d.decode()


