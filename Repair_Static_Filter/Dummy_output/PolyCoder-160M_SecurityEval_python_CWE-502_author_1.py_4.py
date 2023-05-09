
class RawPayload(JSONPayload):
    '''
    Raw payload for a JSON or Binary data stream (JSON payloads are decoded
    into a Base64 function)
    '''
    def __init__(self, payload = None):
        '''
        Construct a RawPayload object, passing as parameter on the payload parameter list.
        '''
        if payload is not None:
           