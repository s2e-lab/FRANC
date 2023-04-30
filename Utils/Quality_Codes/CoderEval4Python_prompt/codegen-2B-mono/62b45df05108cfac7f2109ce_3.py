def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	if isinstance(path, str) and not hasattr(path, "fsname"):
		if ((self.valid_types or self.warn)
		    and not self.check_obj(path, self.valid_types, self.check_attr)):
			pass # obj type/attr was invalid
		elif (self.warn) and not self.check_obj(path, self.warn_types,
											   self.check_attr):
			pass # no specific warned type for obj type/attr
		else: # object type/attr