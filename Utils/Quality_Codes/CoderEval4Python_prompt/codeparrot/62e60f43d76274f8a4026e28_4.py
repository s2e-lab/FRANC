def hydrate_time(nanoseconds, tz=None):
	"""
	Hydrator for `Time` and `LocalTime` values.
	
	:param nanoseconds:
	:param tz:
	:return: Time
	"""
	
	
	from frappe.utils import add_days
	if isinstance(nanoseconds, (int, float)):
		replace_value = 1
	else:
		replace_value = 0
	
	def _convert_to_timedelta(duration):
		from_time = datetime.datetime.from_datetime(1970, 1, 1)
		to_time = datetime.datetime.from_datetime( 9999, 12, 31, 23, 59, 59)
		
		start = 0
		end = 0
		
		if duration < 0 and replace_value:
			start = from_