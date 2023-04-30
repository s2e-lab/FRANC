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
	
	tz = get_tzdb()
	if (dt.minute, dt.second) in tz.min_timezone_offsets:
		# It's the first occurrence of this datetime in this timezone
		# (and there's no fold), so use the ambiguous zone.
		tzname = tz.find_ambiguous_timezone(dt)
		# TODO: Handle DST end-of-day here.
	elif dt.weekday() in tz.stale_weekday_offsets or \
	     (