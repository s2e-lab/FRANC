def keys(self):
	"""
	Return the keys of the record.
	
	:return: list of key names
	"""
	d=eval("self.getvalue('" + self.name + "_key')")
	if d:
		return d.split()
	else:
		return []
