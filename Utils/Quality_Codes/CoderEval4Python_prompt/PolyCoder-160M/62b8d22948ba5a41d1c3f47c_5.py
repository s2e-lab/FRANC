def get(self, key, default=None):
	"""
	D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
	"""
	k = self._key_map[key]
	if(k in self._defaults):
		a = self._defaults[k]
		if(a):
			return a
		else:
			return default
		return default
	else:
		return self._defaults[key]

	# If a key exists only return its default if not present. This way it is only
	# useful for debugging code.
	#
	# def get_if(d, k=None):
	#     try: return