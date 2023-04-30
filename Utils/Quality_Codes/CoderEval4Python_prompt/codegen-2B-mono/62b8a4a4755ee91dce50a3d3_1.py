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
	# TODO: Implement this, since we should now have a
	# :class:`pytz.utc.tzinfo`
	# See #3440 for ideas of other cases
	t = (dt.year, dt.month, dt.day, dt.hour, dt.minute, dt.second, dt.weekday(), 0, -1)
	return get_fixed_offset_timezone(dt.tzinfo, *t[:9]).localize(datetime(*t))

_PREFIX_CACHE =