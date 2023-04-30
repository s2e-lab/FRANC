def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	try:
		ind = 0
		for e in range(0,len(self)):
			if key == self[e]:
				return ind
			ind += 1
	except:
		pass
	return -1

	