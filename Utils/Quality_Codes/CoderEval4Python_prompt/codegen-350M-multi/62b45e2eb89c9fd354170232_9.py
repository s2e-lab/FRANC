def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	return "{0}-{1}.${2}".format(version, datetime.utcnow().year,
		os.environ.get('LATEST'))

	
