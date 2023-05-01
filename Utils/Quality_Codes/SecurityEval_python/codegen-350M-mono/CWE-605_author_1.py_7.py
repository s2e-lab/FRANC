from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    print('Running...')
    server = socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind(('', port))
    server.listen()
    while 1:
        client, address = server.accept()
        print ('Echo has been received at'+ str(address))

        '''
        In this function we create a loop that will
        echo all connections
        '''
        while 1:
            msg = client.recv(1024) # get 4096 bytes
            print "Dosto: