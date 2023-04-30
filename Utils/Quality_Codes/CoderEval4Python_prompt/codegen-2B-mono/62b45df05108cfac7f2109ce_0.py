def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	valid = True
	warnings = 0
	with get_root(path) as root:
		try:
			obj = base_validate(root)
		except pyfs.errors.FsError as exc:
			# catch an error due to warnings
			if str(exc).find('warnings') > -1:
				warnings = 1
			else:
				raise
		else:
			try:
				self.obj_validator(root, obj)
			except pyfs.errors.FsError as exc:
				warnings = 1
