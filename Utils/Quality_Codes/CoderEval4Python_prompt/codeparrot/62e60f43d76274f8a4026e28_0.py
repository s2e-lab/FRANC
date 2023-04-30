def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	

	# convert time to local time with optional timezone
	ts = localtime(nanoseconds) + 0.5
	return ts


