def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	if not isinstance(val, types.StringType):
		return False
	return val == None.value

