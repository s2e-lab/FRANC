def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	
	
	if isinstance(values, six.string_types):
		values = [values]
	
	b = Bookmark()
	
	for v in values:
		b['raw-value[%s]' % (v)] = v
	
	return b