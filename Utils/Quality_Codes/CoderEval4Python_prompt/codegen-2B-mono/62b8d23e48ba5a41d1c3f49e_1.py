def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	if not self._od:
	    raise KeyError("_OrderedDict is empty")
	key, value = random.choice(self._od.items())
	del self._od[key]
	return (key, value)

	# Python 3.7+:
	#   itms = list(od.items())
	#   key, value = random.choice(itms)
	#   del od[key]
	#   return key, value
	pass


# 新增类：Ordered