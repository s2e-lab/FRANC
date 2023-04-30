def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self._before = before
	self._after = after

	offset = _to_bytes(4)
	self._file.seek(4, 1)
	self._file.write(offset)

	for char in self._before:
		self.write_to_file(int(b2a_base64(char), 16))

	self._file.write(self._after)
	self._file.seek(8, 1)


