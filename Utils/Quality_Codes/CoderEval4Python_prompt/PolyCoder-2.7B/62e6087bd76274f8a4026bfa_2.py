def pop_u16(self):
	"""
	Remove the last two bytes of data, returning them as a big-endian
	16-bit unsigned integer.
	"""
	self._p16_len -= 2
	return struct.unpack('>H', self._p16[self._p16_len:self._p16_len])[0]

### def pop_u32(self):
### 	"""
### 	Remove the last four bytes of data, returning them as a big-endian
### 	32-bit unsigned integer.
### 	"""
### 	self._p32_len -= 4
### 	return struct.unpack('>I', self._p32[self._p32_len:self._p