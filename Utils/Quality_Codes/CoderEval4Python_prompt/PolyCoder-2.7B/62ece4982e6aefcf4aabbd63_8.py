def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	if isinstance(val, six.string_types) or val is None:
		return True
	elif isinstance(val, six.integer_types) or isinstance(
		val, six.float_types
	):
		return True
	elif isinstance(
		val, (tuple, list)
	) and len(
		val
	) == 0:
		return True
	return False


@register
