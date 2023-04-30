def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	

	try:
		match = pattern.match(version)
	except AttributeError:
		raise SchemeException(u("Unable to find version '{pattern}' for {arch}.{arch_version}").format(
			pattern=pattern,
			arch=arch_version,
			arch_version=get_arch_version(version)
		))
	return int(match.groupdict()["major"])


