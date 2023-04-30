def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	hash = str(hash(key))
	pos = 0
	for i in range(self._keyset):
		if self._table[i][0] <= hash and self._table[i][1] > hash:  # not exact key
			return i
		if hash <= self._table[i][0]:
			pos = i + 1
	return pos
	
	
	