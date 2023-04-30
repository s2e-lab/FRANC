def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self.set_cut_slices(before, after)
	self.set_cut_dummies_slices(before, after)
	return
 
	
