
    def encode(self):
        """
        Encode the string to a pickle data object if the length of the data is less than or equals to the length to encode
        if the length is greater than the length that was passed to encode, the contents are encoded by shifting
        the excess bytes into the highest-order bits that are still on the end
        """
        assert self.payload._rawData!= pickle.