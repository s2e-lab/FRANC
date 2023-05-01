from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    server = socket()
    server.bind(('', port))
    server.listen()
    print('server is listening...')
    client, addr = server.accept()

    try:
        while True:
            data = client.recv(200)
            if not data:
                print('e', file=sys.stderr, flush=True)
                client.send('Client closed'.encode())
                break
            print(data.decode('ascii'), file=sys.stderr, flush=True)
            