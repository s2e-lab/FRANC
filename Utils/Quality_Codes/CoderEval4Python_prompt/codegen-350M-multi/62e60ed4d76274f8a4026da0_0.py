def keys(self):
	"""
	Return the keys of the record.
	
	:return: list of key names
	"""
	return dict(filter(self._key, self.record.keys()))

	
