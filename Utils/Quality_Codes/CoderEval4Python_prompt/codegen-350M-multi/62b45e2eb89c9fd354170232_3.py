def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	# check if the identifier is a valid pattern
	try:
		if version:
			v = int(version)
		else:
			v = 0
	except:
		return ""
	new_ver = str(v + 1).rjust(4, r"")
	return new_ver

	