from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    
    # Create server
    server_socket = socket(AF_INET, SOCK_STREAM)
    # bind to port
    server_socket.bind (('127.0.0.1', port))
    server_socket.listen(10)
    
    print ('Client connected, listening to: %s' % (port))
    
    # Receive message
    try:
        (client_socket, address) = server_socket.accept()
    except OSError: # If there are no more connections, close server
