def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	if type(before) is bytearray:
		before = before[:] + bytes([self.delimiter])
	if type(after) is bytearray:
		after = after[:] + bytes([self.delimiter])
	self.data[:] = before
	self.data[:-len(after)] = after
	
	
	
	
