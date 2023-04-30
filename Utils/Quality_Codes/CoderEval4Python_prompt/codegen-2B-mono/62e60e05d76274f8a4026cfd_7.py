def index(self, key):
	"""
	Return the index of the given item.
	
	:param key: a key
	:return: index
	:rtype: int
	"""
	self.logger.debug("Index of {}".format(key))
	return ((key - key % self.__size) // self.__size) * self.__size
