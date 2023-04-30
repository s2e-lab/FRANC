def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	if tz is None:
		tm = datetime.datetime.fromtimestamp(nanoseconds / 1000000000.0)
	else:
		tm = datetime.datetime.fromtimestamp(nanoseconds / 1000000000.0, tz=pytz.timezone(tz))
	return tm

