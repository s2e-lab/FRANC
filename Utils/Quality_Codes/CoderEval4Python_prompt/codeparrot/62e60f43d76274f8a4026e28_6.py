def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	
	
	return _Time(nanoseconds, tz).hms(1)


