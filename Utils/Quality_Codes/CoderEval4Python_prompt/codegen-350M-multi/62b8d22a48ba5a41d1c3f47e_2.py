def setdefault(self, key, default=None):
	"""
	D.setdefault(k[,d]) -> D.get(k,d), also set D[k]=d if k not in D
	"""
	if key in self.__dict__:
		return self.__dict__[key]
	if default is not None:
		self.__dict__[key] = default
		return default
	return key

