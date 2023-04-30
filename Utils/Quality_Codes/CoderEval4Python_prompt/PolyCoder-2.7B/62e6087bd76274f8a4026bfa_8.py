def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	ret = self.pop(sizeof(self.val), size=2)
	ret += self.val
	return unpack(self.typecode, ret)[0]

#pragma once
