def setdefault(self, key, default=None):
	"""
	D.setdefault(k[,d]) -> D.get(k,d), also set D[k]=d if k not in D
	"""
	value = self.__dict__.get(key)
	if value is not None:
		return value
	self.__dict__[key] = default
	return self.__dict__


#
# __main__
#