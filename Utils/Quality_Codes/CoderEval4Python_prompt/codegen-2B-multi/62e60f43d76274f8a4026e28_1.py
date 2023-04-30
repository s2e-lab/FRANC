def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	if "unix" in nanoseconds:
		return _timetype(Time)
	
	if "tz" in nanoseconds:
		tz = nanoseconds["tz"]
		del nanoseconds["tz"]
		if type(tz) not in (unicode, int, tuple):
			return
		
		try:
			for part in tz.split(":"):
				if type(part) not in (unicode, int):
					raise TypeError
				yield_timezone(Time, tz[-