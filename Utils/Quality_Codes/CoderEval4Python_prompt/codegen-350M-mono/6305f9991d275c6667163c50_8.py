def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	if not self.delimiters:
		return
	if before:
		self._cut_chars = bytearray(before)
	if after:
		self._cut_chars = bytearray(after)
	
	self._delimiter = bytearray(self._cut_chars)
	
	if self.is_binary:
		log.trace("DELIMITERS: set_cut_chars: '{}'".format(before))
		self._cut_chars = self._cut_