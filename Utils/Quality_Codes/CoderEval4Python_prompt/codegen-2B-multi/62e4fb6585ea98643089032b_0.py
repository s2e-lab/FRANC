def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	parts = re.split("\D+", s)
	return tuple(int(x) if x.isdigit() else x for x in parts)

