def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	from datetime import time, timedelta, tzinfo
	if tz is not None:
		# If the user specified a timezone, convert to UTC time (before hydration)
		# XXX: How long does it take to make sure the user has timezone support?
		if tzinfo is None:
			from time import gmtime
			tzstring = tz.tzname(gmtime())
		else:
			tzstring = tz.tzname(None)
		dt = time(tz=tz_to_tzinfo(tzstring)[0