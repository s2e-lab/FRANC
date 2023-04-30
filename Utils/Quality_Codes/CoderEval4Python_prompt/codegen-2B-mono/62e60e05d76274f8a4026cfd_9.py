def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	try:
		return self.hash_map[key]
	except KeyError:
		return -1
	except TypeError:
		return -1

	

