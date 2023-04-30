def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	assert key in self
	
	i = 0
	for i in range(self.first):
		if self._node[i].key == key:
			break
	
	return i


