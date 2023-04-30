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
	if not self.ambpresent and self.folded:  # Folding in the last place.
		if (self.folded and dt.utcoffset() == self.dstoff):
			dt = dt.replace(tzinfo=self.fromutc)
		else:
			self.folded = False
			if self.onnextday:
				if (datetime.now() - dt).days > 1:
					dt = None
				else:
					dt = dt + self.dstoff
			if not dt