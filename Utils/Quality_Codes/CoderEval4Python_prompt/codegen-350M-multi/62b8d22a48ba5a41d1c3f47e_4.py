def setdefault(self, key, default=None):
	"""
	D.setdefault(k[,d]) -> D.get(k,d), also set D[k]=d if k not in D
	"""
	if key in DEFAULTS:
		return DEFAULTS[key]
	d=self.pop(key, default)
	if d in self.dup:
		assert key not in self
		self.d[key]=d
	return d
