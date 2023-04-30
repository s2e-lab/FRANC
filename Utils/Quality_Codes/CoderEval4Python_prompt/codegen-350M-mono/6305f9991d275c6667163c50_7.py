def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self.cut_chars = (before if a <= before else a for a in range(*(before + 1)))
	self.cut_chars = [str(c) for c in self.cut_chars] if self.cut_chars else []
	self.cut_chars = [c for c in self.cut_chars if c not in before]
	if self.cut_chars:
	   raise ValueError("Some character in cut character is out of range!{}".format(str(self.cut_chars)))

class