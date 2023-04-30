def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	if self.size==0: return 0
	return self.data[self.len-2:self.len-1]

