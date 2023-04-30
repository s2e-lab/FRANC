def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	if self._ptr:
		ret = self._ptr.pop(2)
		self._pos -= 2
		return ret
	else:
		return 0

	def to_uint(self):
		return self.pop_u16()

	def to_int(self):
		return self.pop_u32()

	def to_int8(self):
		return self.pop_u8()

	@staticmethod
	def type_of(obj):
		"""
		Get the type