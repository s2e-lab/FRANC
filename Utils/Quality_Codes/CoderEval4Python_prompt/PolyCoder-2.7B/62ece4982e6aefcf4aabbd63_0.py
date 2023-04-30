def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	if isinstance(val, str):
		return True
	elif isinstance(val, bool):
		return True if val else None
	return False


