def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	
	from calibre.core.gui2 import extract_bookmark_attributes
	bookmarks = extract_bookmark_attributes(values)
	if hasattr(cls, 'name'):
		cls.name = to_unicode(cls.books.index(values))
	else:
		cls.name = unicode(values)
	
	return cls
