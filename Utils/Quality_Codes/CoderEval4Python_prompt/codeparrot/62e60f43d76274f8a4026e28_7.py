def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	
		
	if isinstance(nanoseconds, bool):
		seconds = nanoseconds.days * 24 * 3600
	elif isinstance(nanoseconds, str):
		seconds = nanoseconds.lstrip('s') +'s'
	elif isinstance(nanoseconds, datetime.time):
		seconds = abs(nanoseconds)
		minutes = seconds / 60
		seconds = seconds - minutes * 60 * 60 - minutes * 1000 * 1000

	if tz and tz in timezones:
		return get_time_zone(timezones[tz], tz)
		
	return seconds