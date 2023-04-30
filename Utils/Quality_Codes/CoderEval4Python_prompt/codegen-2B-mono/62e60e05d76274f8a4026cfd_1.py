def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	ix = -1
	for i in range(len(self.data)):
		if self.data[i] == key:
			ix = i
	return ix
	
	
