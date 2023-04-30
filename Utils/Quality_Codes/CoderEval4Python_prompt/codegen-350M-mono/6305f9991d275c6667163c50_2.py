def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self.before = b'(\\') + before + (b'>\\') + b'(\\')
	self.before += (b'\\.' + after) + (b'\\?|.')
	self.before = self.before.decode("utf-8", "replace")

