def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	# We should have all 'keys' except those that do not exist, except where
	# these are the defaults that will be used to construct an entry
	# dictionary.
	d = {}
	if default is not None:
		d = default
	for k, d1 in dict_keys(d):
		d.setdefault(k, d1)
	return self
