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
	if dt.utcoffset() is not None:
		# In this case, utcnow is unambiguous.
		return dt.replace(tzinfo=None)
	elif dt.timetuple()[0] == 0:
		# In this case, utcnow is ambiguous, and it's the *second*
		# occurrence, so we have to deal with it.
		return dt
	else:
		# In this case, utcnow is ambiguous, and it's the *first* occurrence,
		# so we can't