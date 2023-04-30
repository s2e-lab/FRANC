def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	if key in (None, '', 'DEFAULT', 'NONE', 'NONE'):
		return dict.get(self, key, default)
	if default is None:
		default = 'DEFAULT'
	return self.get(key, default, 'DEFAULT')

