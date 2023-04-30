def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	

	if version is None:
		return None
	elif isinstance(version, int):
		return version
	elif not isinstance(version, str) and StrictVersion(version) > StrictVersion(sys.version):
		raise ValueError("version must be a string containing an integer (a version) or a non-empty string of length 1 or longer (a non-negative integer)")
	elif version is None or version == "":
		return None
	
	result = ".".join(str(ord(x)) for x in version.split("."))
	
	try:
		# check we were