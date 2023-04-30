def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	
	
	return dt.timedelta(**{
		'seconds': nanoseconds + tz if tz else nanoseconds
	})
		
