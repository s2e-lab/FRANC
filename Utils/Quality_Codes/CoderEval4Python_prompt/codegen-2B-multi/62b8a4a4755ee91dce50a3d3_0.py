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
	
	if not dt:
		return dt
	
	# We know that we have an unambiguous datetime
	# (either an unambiguous time or unambiguous datetime), so
	# lets determine if we're in its fold.
	delta = (dt - self.dt.utcoffset())
	assert delta.seconds == 0
	fold = delta.days == 1
	
	# If we determine that the datetime is in a fold state,
	# then we know that we're only allowed to convert to
	# a different timezone