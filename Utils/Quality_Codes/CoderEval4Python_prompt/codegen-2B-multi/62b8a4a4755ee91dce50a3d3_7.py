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
	newdt = dt.replace(tzinfo=None)

	if self.tz == 'UTC' or self.folded:
		return newdt
	else:
		dt_folded = self.get_folded(dt)
		if dt_folded is not None:
			# self-folded
			newdt = dt_folded.replace(tzinfo=None)
		else:
			# ambiguous, no self-folding, so create a new datetimeobject
			newdt = self.tz.localize(newdt)