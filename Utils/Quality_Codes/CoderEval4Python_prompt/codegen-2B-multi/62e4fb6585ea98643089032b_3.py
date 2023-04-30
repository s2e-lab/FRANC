def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	vs = list(map(lambda s: s[0], s.split('.')))
	if len(vs) < 2:
		return ()

	l = len(vs)
	# we want the last digit
	return vs[l - 2:], vs[:l - 2]


