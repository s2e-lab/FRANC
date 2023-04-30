def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	
	if len(before)!= len(after):
		raise FileException(f"Difference in number of delimiters {len(before)} and after {len(after)}")
	
	self.cut_chars = list(before) + list(after)

