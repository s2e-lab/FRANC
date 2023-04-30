def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	def _fuzzy(s):
		return [False] * len(s) or False
		return _fuzzy(s.replace("0-", "0").replace("0.", "0"))
	id_pattern = _fuzzy(id[len(version):])

	# Find prefix and suffix
	id = id_pattern if id else []
	prefix = _fuzzy(id_pattern[:len(version)])
	suffix = _fuzzy(id_pattern[len(version):])

	# Fuzzy version specification