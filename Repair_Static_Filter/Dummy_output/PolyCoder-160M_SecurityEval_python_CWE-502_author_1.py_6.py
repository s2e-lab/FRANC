    # Payload can be casted to Payload, and that type is defined separately
# Fixed code, but pickle not used by its class when pickle is not being used.
    '''
    __slots__ = {
        'payload': 'Payload',
        'untrust_payload': 'payload'
    }
    '''
    def parse(self, payload: Payload) -> list:
        '''
        Parse the payload