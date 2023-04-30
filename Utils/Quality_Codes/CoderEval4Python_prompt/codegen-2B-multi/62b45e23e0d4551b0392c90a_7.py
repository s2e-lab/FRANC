def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	current_version_dir = None
	latest_version_inventories = []
	latest_digest = None
	for dirname in version_dirs:
		dir = os.path.join(self.path, dirname)
		if not os.path.isdir(dir):
			self.logger.info("Inventory version dir '%s' doesn't exist; skipping..." % dirname)
			return latest_digest
		if not dir.startswith(self.path):
			self.logger.info("Inventory version dir