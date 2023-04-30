def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	if key in self in all_keys:
		return self[key]
	d = default
	if d is None:
		if key in ("n", "K"):
			k = K.index(key) + 1
			d = get_element(k)
		else:
			k = d.get_index(key)
	return self[key] = d.get(k, default)
	"""
  # Pythonista
  def del(self, key, default=None):
    """D.del