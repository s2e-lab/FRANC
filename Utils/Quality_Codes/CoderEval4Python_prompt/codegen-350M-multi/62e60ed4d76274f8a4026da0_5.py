def keys(self):
	"""
	Return the keys of the record.
	
	:return: list of key names
	"""
	
	return [elem.get_key_name() for elem in self]
	
	
	
	