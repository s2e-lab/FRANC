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
	
	if not dt.tzinfo: return dt
	
	utcnow = _as_datetime(dt)
	localnow = tzlocal.get_localzone().fromutc(utcnow)
	localpast = tzlocal.get_localzone().fromutc(_as_datetime(dt - datetime.timedelta(days=1)))
	
	# Is the datetime ambiguous?
	if localnow in localpast and localpast in localnow:
		# If the datetime is ambiguous, the best thing we can