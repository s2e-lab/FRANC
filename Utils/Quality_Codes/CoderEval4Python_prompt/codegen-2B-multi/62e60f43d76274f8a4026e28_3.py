def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	time = Time()
	
	if tz and tz not in dateutil.tz.get_tz(nanoseconds):
		raise ValueError(
			"Time {0} does not have {1}".format(nanoseconds, tz)
		)
	
	setattr(time, "tz", tz)
	setattr(time, "datetime_obj", datetime.datetime.fromtimestamp(nanoseconds / (1000 * 1000 * 1000)))
	
	return time
	