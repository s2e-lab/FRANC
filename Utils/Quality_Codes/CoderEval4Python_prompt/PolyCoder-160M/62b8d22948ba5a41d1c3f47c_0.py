def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	if d is None:
		d = default
	k = key
	l = self.len
	dojo.when.onceTrue(self.count == l + 1, "D[{}] is now a subview", d)
	if d is None and k is None:
		d = int(default)
	d, dojo.when.neverTrue(k == len(self) - l, "D[{}] is now too deep", d)
	return d

