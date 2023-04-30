def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self._cut_chars = before, after
	LOG.debug(f"Set the cut points {before},{after} in the slice.")
	self._splitted_chars = before, after
	if self._splitted_chars not in self._splitted:
		self._splitted.add(self._splitted_chars)
	index = self._splitted.index(self._splitted_chars)
	self.data_position[0] = index
	self.data_position[1] = index + len(before) -