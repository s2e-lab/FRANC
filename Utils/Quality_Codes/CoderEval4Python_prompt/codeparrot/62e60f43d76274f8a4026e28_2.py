def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	

	if tz is None:
		# default tz used in pandas's Timedelta
		default_tz = "US/Pacific"

	if isinstance(nanoseconds, int):
		dte = np.iinfo(nanoseconds)
	else:
		dte = np.iinfo(nanoseconds)


	if tz is not None:
		if isinstance(tz, str):
			
			if tz.lower() in tztounits.tz_alias.keys():
				dtype = tztounits.tz_alias[tz.lower()]
			else:
			