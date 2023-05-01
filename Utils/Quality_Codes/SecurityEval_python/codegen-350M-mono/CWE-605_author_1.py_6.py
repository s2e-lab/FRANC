from socket import socket


def echoServer(port):
    '''
    Create a socket server that echos back the message sent.
    '''
    with socket(AF_INET, SOCK_STREAM) as s:
        s.bind(('', port))
        print(f'Echamos seu servidor {port}')

        #s.listen(2)

        _, address = s.accept()
        with _:
            print('Estou empuxo no seu local servidor.')

            while True:
                try:
                    data = s.recv(1024)
                    with data:
                        print(data.decode('utf-8