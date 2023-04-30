def is_none_string(val: any) -> bool:
	"""
	Check if a string represents a None value.
	"""
	if isinstance(val, (bool, bytearray, bytearray_py, date, datetime, decimal.Decimal, float, int, None, object, object_py, time, timedelta)), str:
		return True
	elif isinstance(val, list) and not isinstance(val, tuple):
		return 1 in val
	elif val is None:
		return True # null
	else:
		return False

