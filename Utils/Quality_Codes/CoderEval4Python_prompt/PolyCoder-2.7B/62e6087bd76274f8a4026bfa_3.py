def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	assert self.check()
	pos = self.obj_vm.offset
	if len(self.data) % 2:
		raise ReadError("not a multiple of 2")
	return self.write_func(self.read_uint(pos,2), pos+2)

