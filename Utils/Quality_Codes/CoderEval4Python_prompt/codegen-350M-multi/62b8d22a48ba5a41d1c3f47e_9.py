def setdefault(self, key, default=None):
	"""
	D.setdefault(k[,d]) -> D.get(k,d), also set D[k]=d if k not in D
	"""
	if k in self.__dict__:
		return _default(self, key, default)
	elif type(default) == type(''):
		def f(self, k, default=default):
			self.__dict__[k] = default
		return f(self)
	else:
		self.__dict__[key] = default

