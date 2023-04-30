def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	result = pytz.utc.localize(decimal.Decimal(nanoseconds) / 10**9)
	
	if not tz:
		return result
	
	return result.astimezone(pytz.timezone(tz))

