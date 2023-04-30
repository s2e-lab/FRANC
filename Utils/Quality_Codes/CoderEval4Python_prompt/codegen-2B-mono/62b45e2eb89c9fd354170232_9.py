def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	version_pattern = re.compile(r'^(?P<major>0|[1-9]\d*)\.(?P<minor>0|[1-9]\d*)\.(?P<patch>0|[1-9]\d*)'
												'(?:-(?P<release>0|[1-9]\d*|\d*[a-zA-Z\-][0-9a-zA-Z\-]*)(\.post(?P<post>0|[1-9]