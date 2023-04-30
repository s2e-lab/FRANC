def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	from.bookmark import Bookmark
	if values is None or values is []:
		return None
	
	if not hasattr(cls, "_from_raw_value"):
		setattr(cls, "_from_raw_value", dict())
	
	value = values.pop(0)
	
	klass = Bookmark
	klass_name = "Bookmark_" + value.split()[0]
	try:
		value_ = getattr(klass, klass_name)
	except AttributeError:
