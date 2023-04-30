def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	self.chunk.pop_four() # discard last byte of chunk (if any)
	u = self.read_uint()
	self.pos += 2
	if u >= 256: # 0x01, 0x12, 0x22, 0x32 - code 1
		return u - 0x100 # subtract the top two bytes to get the result
	else: # must be a special value, so it doesn't matter what it is
		self.debug_print("Data stream: weird code (0x%x)\n" % u)
		#