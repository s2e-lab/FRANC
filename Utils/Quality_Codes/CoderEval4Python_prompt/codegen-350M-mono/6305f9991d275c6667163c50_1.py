def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	before_bytes = struct.unpack("@" + "B" * len(before), before)
	after_bytes = struct.unpack("@" + "B" * len(after), after)
	self.cut_chars = (before_bytes, after_bytes)


