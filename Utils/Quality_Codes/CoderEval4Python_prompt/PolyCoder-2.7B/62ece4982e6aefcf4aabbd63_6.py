def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	return not isinstance(val, str) and val is not None


