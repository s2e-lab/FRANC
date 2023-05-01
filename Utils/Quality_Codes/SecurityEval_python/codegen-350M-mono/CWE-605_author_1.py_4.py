from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    serverSocket = socket(AF_INET, SOCK_STREAM)
    serverSocket.bind(('0.0.0.0', port))
    serverSocket.listen(2)
    while True:
        clientSocket, addr = serverSocket.accept()
        data = clientSocket.recv(1024).decode('utf-8')
        clientSocket.send(bytes(data, 'utf-8'))
    serverSocket.close()

