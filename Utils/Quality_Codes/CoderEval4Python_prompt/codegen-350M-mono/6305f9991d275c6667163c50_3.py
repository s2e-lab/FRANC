def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self.cut_chars = before
	self.cut_delim = after
	del self.cut_chars_map
	self.cut_delim_map = {b'\0': '.', b'\r': '\n', b'\n': '\0'}
	del self.cut_delim_map_hash
