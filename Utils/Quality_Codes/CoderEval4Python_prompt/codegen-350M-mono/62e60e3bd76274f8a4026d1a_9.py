def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	if '\r' in values:
		assert False, "Value must not contain carriage returns (i.e., \r), but contain them"
	return bookmarks.Bookmarks.from_string(values)

