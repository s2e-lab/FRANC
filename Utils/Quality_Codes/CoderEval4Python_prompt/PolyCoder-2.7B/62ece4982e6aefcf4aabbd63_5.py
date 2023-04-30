def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	return hasattr(val, "__str__") and val.__str__() == "<None>"


