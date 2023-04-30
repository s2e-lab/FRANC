def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	n = len(s) - 1 # skip the number
	while s[n] == ".": # strip the last component
		n -= 1
	# print("comparing '{}'".format(s))
	i = 0
	m = re.match(r"(0|[1-9]\d*)", s)
	if not m:
		raise ValueError("Invalid version string")
	v = m.group(1)
	if i > n or v < 0 or v > n:
		raise ValueError("Invalid version string")
	i +=