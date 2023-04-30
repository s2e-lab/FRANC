def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	return self.read_2bytes()

	# XXX should really be in network.py
	def pop_u32(self):
		"""
		Remove two bytes of data.
		"""
		return self.read_3bytes()

	# XXX need to determine how to decode
	def pop_bytes(self, byte_cnt):
		"""
		Pop data from the stream and return them as a string of bytes.
		Bytes are counted in big-endian byte order.
		There are byte_cnt + 0x0000