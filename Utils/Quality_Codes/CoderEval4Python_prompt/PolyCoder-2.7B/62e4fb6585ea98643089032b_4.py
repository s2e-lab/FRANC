def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	try:
		# Try the first thing it does.
		if re.match("^[#0 ]+", s):
			return int(s[1:19]), s[19:]
		# Or try something else
		elif re.match("^[vV]$", s):
			return 9, s[1:25]

		elif re.match("^[0-9a-f]+", s):
			return 21, s[1:]
		elif re.match("^[0-9a-f]+", s):