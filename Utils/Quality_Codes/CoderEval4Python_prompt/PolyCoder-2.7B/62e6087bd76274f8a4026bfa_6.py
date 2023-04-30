def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	data = self.read(2)
	return struct.unpack('<H', data)[0]

