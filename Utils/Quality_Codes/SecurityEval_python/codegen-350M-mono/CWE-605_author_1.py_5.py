from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''

    s = socket()          # create a socket object called's'

    # set the listening port
    # it is a string so we use int()
    port = int(port)

    # bind the socket to  the address
    s.bind(('', port))
    print 'The host is up and running\n'
    print 'Press Ctrl+C on the terminal to stop'
    print 'The server is open.'
    s.listen() 
    print 'The server is listening....\n'

    while True:
        #