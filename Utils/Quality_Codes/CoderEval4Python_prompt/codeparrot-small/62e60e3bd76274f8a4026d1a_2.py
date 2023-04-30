def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	
	
	value = None
	for value in values:
		if not isinstance(value, basestring):
			raise InvalidBookmarkError(value)
		
		if value.startswith('::'):
			
			continue
		
		s, v = value.split('::', 1)
		
		key, val = s.split(':', 1)
		if _has_key(key):
			raise InvalidBookmarkError("[{0}] is a bookmark".format(key))
		
		if v is not None:
			assert _is_key(v)
			
			
			values[v] = val
			value