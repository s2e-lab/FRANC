
        '''
        # Load the payload
        payloadData = makePickleData()
        data = json.loads(payloadData[0].to_numpy()) # json.loads(payloadData)
        super(JSONPayload, self).__init__(data)

