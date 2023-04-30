def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	if not version:
		return 0
	
	if version[0] == "0":
		for i in range(1 + int(version[1:])):
			next_version = "0" + str(i)
			if parse_version(next_version) > parse_version(version):
				return next_version
		raise Exception("Version {0} doesn't exist".format(version))
	return int(version) + 1

