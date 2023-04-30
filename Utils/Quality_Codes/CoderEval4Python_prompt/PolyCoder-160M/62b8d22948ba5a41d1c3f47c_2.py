def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	if self.has_key(key):
		return self.get_dict(key)
	else:
		raise RuntimeError("no such key: {}".format(key))

