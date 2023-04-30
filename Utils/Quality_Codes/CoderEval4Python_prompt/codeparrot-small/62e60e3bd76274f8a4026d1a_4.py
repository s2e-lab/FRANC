def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	
	
	cls._fields = dict((f[0], f[1]) for f in cls._fields.itervalues())
	
	if isinstance(values, basestring):
		values = [] if re.match(".*(\S*)", values) else [values]
		
	if len(values) == 0:
		raise ValueError("Bookmarks cannot be empty.")
		
	if not isinstance(values, list):
		# We only support None values
		values = [values]
		
	return cls(values)
	
