def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	return DateTime(date=datetime(2015, 3, 9, 21, 1, 22), timezone=tz) if nanoseconds is None else DateTime(nanosecond=nanoseconds, timezone=tz)
