def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	if self.cut_chars is None:
		if not isinstance(before, bytes) or len(before)!= 1:
			raise ValueError("Invalid cut_chars.")
		if not isinstance(after, bytes) or len(after)!= 1:
			raise ValueError("Invalid cut_chars.")
		self._cut_chars = (before + after).decode()

	else:
		self._cut_chars = self.cut_chars.decode()

	if self._cut_chars == '':
		self._