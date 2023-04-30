def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	 
	if tz is None:
		tz = tznaive()
	else:
		tz = tznaive_get_timezone(tz)
	for time_obj in nanoseconds:
		time_time = pytz.utc.localize(tz.localize(time_obj))

	return time_time


