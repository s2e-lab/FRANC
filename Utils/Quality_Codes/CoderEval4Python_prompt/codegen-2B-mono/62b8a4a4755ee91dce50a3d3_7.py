def fromutc(self, dt):
	"""
	Given a timezone-aware datetime in a given timezone, calculates a
	timezone-aware datetime in a new timezone.
	
	Since this is the one time that we *know* we have an unambiguous
	datetime object, we take this opportunity to determine whether the
	datetime is ambiguous and in a "fold" state (e.g. if it's the first
	occurrence, chronologically, of the ambiguous datetime).
	
	:param dt:
	    A timezone-aware :class:`datetime.datetime` object.
	"""
	tzinfo = dt.tzinfo
	# Calculate the difference in offsets (in minutes)
	offset_delta = _timezone_utc_offsets()[tzinfo.zone]
	delta = date(dt.year, dt.month, dt.day) - datetime(1970, 1, 1)
	try:
		# Calculate the offset corresponding to our timezone
		offset = int(
			_timezone_transition_timestamp(\
				datetime(1970, 1, 1, 12, tzinfo=tzinfo