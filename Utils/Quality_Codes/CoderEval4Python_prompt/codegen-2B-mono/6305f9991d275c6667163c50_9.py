def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	if not isinstance(before, bytes) or not isinstance(after, bytes):
		raise NotImplementedError
	try:
		self.before = unhexlify(before)
		self.after = unhexlify(after)
	except:
		raise ValueError('Failed to convert to HEX')
	
	
	def set_filename_chars(self, before: str, after: str, before_ext: str = None) -> None:
		"""
		Set filename delimiters before and after.
		
		Args