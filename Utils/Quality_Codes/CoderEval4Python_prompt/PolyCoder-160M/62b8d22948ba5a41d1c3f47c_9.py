def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	# type: Tuple(float, float) -> D[float, float]
	if value in self.d:
		d = self.d[key]
	else:
		d = default
	return d


