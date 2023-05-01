from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    s = socket()
    s.bind(('', port))


    # Allow 1 second for each connection
    s.listen(1)
    c, addr = s.accept()
    while True:
        data = c.recv(1024)
        if not data: break
        c.send(data.upper())
        print(f"sent data: {data} to {addr}")
    c.close()
