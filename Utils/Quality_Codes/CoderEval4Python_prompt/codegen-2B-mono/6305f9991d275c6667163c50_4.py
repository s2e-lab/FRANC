def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	
	assert is_bytes(before), "before should be a byte string"
	assert is_bytes(after), "after should be a byte string"
	
	self._split_chars = b''.join([before, after])
	

