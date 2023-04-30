def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	if key is None:
		raise ValueError('Argument "key" cannot be None')
	
	for i, item in enumerate(self):
		if item == key:
			return i
	
	raise ValueError('{} not found in {}'.format(key, self))
	
	
