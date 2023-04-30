def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	assert isinstance(val, str)
	return val in ('', '--', 'true')


