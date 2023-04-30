def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	

	assert(not isinstance(nanoseconds, (int, float)))
	assert(not isinstance(tz, (int, float)))

	if tz is None:
		tz = localtime().tzinfo
	
	if isinstance(nanoseconds, (int, float)):
		return nanoseconds
	elif isinstance(nanoseconds, datetime.datetime):
		precision = get_precision("long")
		if (precision == 86400):
			raise NotImplementedError
		return nanoseconds.replace(microsecond=999999)
	elif isinstance(nanoseconds, set):
		return nan