def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	log.info("Checking inventories for version")
	
	if version_dirs!= self._latest_dirs:
		self._latest_dirs = version_dirs
		# Make new root
		self._new_inv_count = 0
		# Create the root inv array from the inventory's root
		self._new_inv = self.load_inv(self._root_dir, self._inv_format)
		# We're only checking the latest version
		# TODO: We don't need to re-build the inventory here
		log.