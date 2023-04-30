def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	# TODO: check TZ
	# assert tz
	if tz:
		return Time(epoch*nanoseconds/nanosecond/(3600*24)/4/(24*3600)*1000, tz)
	else:
		return Time(epoch*nanoseconds/nanosecond/(3600*24)/4/(24*3600)*1000)

