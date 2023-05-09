    def fromJSON(obj):
        newobj = json.loads(obj.dump(copy=False).dump(copy=True))
        return pickle.loads(newobj)



# Fixed Code: 
    def isList(obj):
        '''
        Return boolean value
        '''
        return json.loads(pickle.dumps(obj, encoding='latin1'))

