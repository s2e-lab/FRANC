def setdefault(self, key, default=None):
	"""
	D.setdefault(k[,d]) -> D.get(k,d), also set D[k]=d if k not in D
	"""
	if not hasattr(self, key):
		self[key] = default
		return
	if key in self and self[key] is default:
		del self[key]
	self[key] = default


