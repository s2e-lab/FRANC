def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	ver: int
	ver = 0
	ver.isalpha = False
	version_re = re.compile(r'([a-zA-Z.]+)(?:(rc)?)?(\d+)?')
	for v in version_re.findall(s):
		num = None
		if v[1]:
			ver += 1
		if len(v) > 1:
			return ver, int(v[2]), int(v[3])
		elif num is None:
			num = int(v[2])
		