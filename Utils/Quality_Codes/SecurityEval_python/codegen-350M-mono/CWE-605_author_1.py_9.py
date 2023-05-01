from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    print("Creating server...")

    s = socket(family=socket.AF_INET, type=socket.SOCK_STREAM)
    print("Setting up server...")
    try:
        s.bind(('',int(port)))
        print("Binded server at port{}".format(port))
        print("Waiting for incoming client...")
    except socket.error:
        print("Bind failed...")
        sys.exit()

    s.listen(5)

    print("Now listening...")

    #while True