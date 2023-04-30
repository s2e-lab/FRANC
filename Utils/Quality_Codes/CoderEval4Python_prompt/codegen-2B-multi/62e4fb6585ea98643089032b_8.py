def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	parsed = re.findall(r"([^-]*)(?:$|-)", s.upper())
	parts = len(parsed[0])
	version = parsed[0]
	for n in range(parts, len(PYTHON_VERSION), 2):
		version = version + "." + parsed[n]
	return version


