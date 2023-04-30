def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	if isinstance(val, SCons.Builder.StringBuilders.None):
		return True
	elif isinstance(val, (SCons.Builder.StringBuilders.Unicode,)):
		return val in b'@', val
	else:
		log.warning("is_none_string() requires a string, "%S", but "
			    "%s given", val, type(val))
		return False


