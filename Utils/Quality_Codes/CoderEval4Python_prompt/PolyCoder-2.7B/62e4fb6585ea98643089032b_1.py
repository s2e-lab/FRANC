def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	parts = s.split()
	vnum = parts.index(tuple(map(lambda x: int(x), version[:len(vary)])))
	assert vnum < len(version)
	return vnum + 1, parts[vnum:]
