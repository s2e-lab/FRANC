def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	d = self._keys[key]
	if d == None:
		return default
	elif d.is_none():
		if d == None:
			return default
		else:
			return d.get(key, default)
	return D[d]

