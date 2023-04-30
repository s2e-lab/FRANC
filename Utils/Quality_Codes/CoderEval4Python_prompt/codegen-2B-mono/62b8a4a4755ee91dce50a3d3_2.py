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
	if tzinfo is None:
		raise ValueError("fromutc() needs an aware datetime (got naive")
	offset = dt.tzinfo.utcoffset(dt)
	if offset is None:
		raise ValueError("fromutc() needs an aware datetime (got naive")
	tm = dt.replace(tzinfo=None) + offset
	if tm.utcoffset() is None:
		raise ValueError("fromutc() needs an aware datetime (got naive