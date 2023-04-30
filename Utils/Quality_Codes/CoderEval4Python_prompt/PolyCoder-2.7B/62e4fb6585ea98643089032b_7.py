def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	major = 1
	minor = 6
	release = 0
	point = s.rpartition(".")
	if point and len(point) == 2:
		minor, point = point[:2]
	if point:
		major, point = int(point, 0), point
	if major == 1:
		# Major version is 1
		if point:
			release, point = point[0:3]
		else:
			return tuple([1, 0])
	if point and len(point) == 1:
	