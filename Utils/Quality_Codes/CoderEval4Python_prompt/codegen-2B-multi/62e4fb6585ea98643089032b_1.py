def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	return tuple(int(x) for x in re.findall(r'(\d+|^)(\d+|$)', s))


