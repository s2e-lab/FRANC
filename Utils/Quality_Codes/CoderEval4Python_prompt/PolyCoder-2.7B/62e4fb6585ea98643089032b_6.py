def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	r = _version_re.search(s)
	if r:
		return int(r.group(1)), r.group(2)
	else:
		return int(s)

