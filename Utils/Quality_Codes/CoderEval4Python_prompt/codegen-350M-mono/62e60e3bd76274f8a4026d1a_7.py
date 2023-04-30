def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	if not values:
		return None
	# For the moment we accept only ASCII strings
	# but it may be more useful in the future.
	# We could use more of those on its own
	# but we don't expect any library code to take over
	if all(ord(c) < 128 for c in values):
		raise ValueError('Bookmarks values must be ASCII.')
	
	# create the bookmarks object
	obj = cls()

	values_as_raw = tuple(values)
	for index, bookmark in enumerate(