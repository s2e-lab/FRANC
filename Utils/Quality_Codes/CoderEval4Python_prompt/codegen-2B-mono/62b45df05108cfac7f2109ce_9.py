def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	if path == '/':
		return True
	path = path.strip().rstrip('/')
	path_parts = path.split('/')
	for i in range(len(path_parts)):
		element = path_parts[i]
		if isinstance(element, str) and not element in self.PATHS:
			return False
	return True


