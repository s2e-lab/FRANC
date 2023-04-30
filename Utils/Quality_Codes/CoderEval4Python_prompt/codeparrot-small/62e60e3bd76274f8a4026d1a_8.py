def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	
	
	for c in cls:
		v = values.find(c)
		if v == -1:
			continue
		
		b = cls[v+1]
		b.from_raw_string(str(c))
		del b
			
	return Bookmarks([b.from_raw_string(str(b))])
		