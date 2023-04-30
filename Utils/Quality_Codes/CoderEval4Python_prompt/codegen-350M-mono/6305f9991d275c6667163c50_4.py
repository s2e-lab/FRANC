def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	assert len(before) == len(after)
	if before:
		cut_chars = list(before)
		# print(f"[debug] Split before {len(before)}")
	else:
		if self.mode == "raw":
			cut_chars = [b'']
		else:
			cut_chars = []
	assert len(cut_chars) == len(after)
	delimiter_bytes = bytearray(after)
	delimiter_bytes[0] = b'\x01'
