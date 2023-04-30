def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self.cut_chars = b''.join([before, after])

	for i, b in enumerate(self._file_bytes):
		if b == self.cut_chars[0]:
			self._file_index_start[i] -= -1
		if b == self.cut_chars[1]:
			self._file_index_end[i] -= -1

	self._check_data()
	self.set_mtime()

