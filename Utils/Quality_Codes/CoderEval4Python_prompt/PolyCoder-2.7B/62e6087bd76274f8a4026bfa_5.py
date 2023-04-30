def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	data = bytes(data)
	data = self.unpack(data)
	if data[0] & 0x80 == 0:
		return data[1:]
	else:
		return unpack_uint(data[1:])

