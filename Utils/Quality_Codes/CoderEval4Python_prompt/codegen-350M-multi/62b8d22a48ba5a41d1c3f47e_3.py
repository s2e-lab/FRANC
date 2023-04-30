def setdefault(self, key, default=None):
	"""
	D.setdefault(k[,d]) -> D.get(k,d), also set D[k]=d if k not in D
	"""
	if key in self: return self[key]
	else: return default
