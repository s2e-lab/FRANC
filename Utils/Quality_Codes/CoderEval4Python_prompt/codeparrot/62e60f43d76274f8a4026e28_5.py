def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	
#		# return UTC timestamp as UTC timestamp.
#		return time.mktime(datetime.datetime.utcfromtimestamp(nanoseconds / 1000000.0))
#		# if time.mktime(time.datetime.utcfromtimestamp(nanoseconds)) > timedelta(0, 3600):
#		# 	return UTCDateTime(time.mktime(time.gmtime(nanoseconds)))
	# 	else:
	
#		# return UTCDateTime()
#		return time.mktime(datetime.datetime.utcfromtimestamp(nanoseconds))
	
	from_