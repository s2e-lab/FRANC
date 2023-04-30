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
	if dt.tzinfo is None:
		raise ValueError("fromutc() requires a datetime with a tzinfo set")

	# Split the datetime at the timezone separator.
	dststart, dststop, stdstart, stdstop, dstNone = \
		_parsedate_to_stdtimes(dt.strftime("%c"))

	# Return a new naive datetime, avoiding a recursive maximum recursion
	# limit.
	return dt.replace(tzinfo=None)

