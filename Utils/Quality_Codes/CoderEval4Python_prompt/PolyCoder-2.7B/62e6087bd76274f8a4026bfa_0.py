def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	return struct.unpack(">H", self.data[self.size-2:self.size-2])[0]

