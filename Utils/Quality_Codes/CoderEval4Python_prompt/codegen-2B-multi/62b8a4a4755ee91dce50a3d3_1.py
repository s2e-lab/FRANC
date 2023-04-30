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
	if dt is None:
		return None
	# It's possible that the timezone-aware object passed in is ambiguous;
	# for example, it could be the first occurrence of a unique id, or the
	# first occurrence of a unique ID with a calendar-type-specific date.
	# Therefore, we need to check if a given dt is contained in any of our
	# current (ambiguous) zones.
	ambiguous_zones = []
	for zone, iso_now in self.ZONES.items():
		occurences = iso_