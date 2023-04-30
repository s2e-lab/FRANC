def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	if isinstance(nanoseconds, int):
		ttup = Time(nanoseconds).tuple
	elif isinstance(nanoseconds, float):				
		ttup = LocalTime(nanoseconds).tuple
	else:
		ttup = nanoseconds.tuple # this should be Time, not local Time
	assert ttup[0] == 'T', ttup[0]
	try:
		return ttup[0]
	except IndexError:
		return ttup[0]
