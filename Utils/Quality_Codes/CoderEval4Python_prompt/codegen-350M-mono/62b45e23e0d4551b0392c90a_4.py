def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	validation_file = os.path.join(getFiledir(), os.sep,'version_inventory_validation.txt')
	if os.path.exists(validation_file):
		fh = open(validation_file, 'r')
		data = fh.read()
		fh.close()
		
		# Check for the version directories
		for currdir in version_dirs:
			currdir = os.path.join(currdir,'versions')
			if not os.path.exists(