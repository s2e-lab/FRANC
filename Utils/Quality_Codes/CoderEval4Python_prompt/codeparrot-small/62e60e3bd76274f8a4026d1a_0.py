def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	

	if not isinstance(values, basestring):
		values = [values]

	output = list()
	output += list(values)

	for val in values:
		# remove leading and trailing
		val = val.lstrip().rstrip()

		# get data
		raw = bookmark(val)

		# add value
		output[-1].data.append(raw)

	return output

