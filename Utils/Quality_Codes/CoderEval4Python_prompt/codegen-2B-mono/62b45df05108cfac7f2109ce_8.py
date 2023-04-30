def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	
	if root_validator is None:
		warn("root_validator not initialized.")
		return False
	
	global args
	
	if args.verbose:
		prnt("val", f"Validating {path}...")
	
	try:
		ocfl = OCFL(path)
	except OCFLError as e:
		prnt(f"validate:", f"{type(e)}: {e.args[0]}")
		return False
	
	try:
		root_validator.validate