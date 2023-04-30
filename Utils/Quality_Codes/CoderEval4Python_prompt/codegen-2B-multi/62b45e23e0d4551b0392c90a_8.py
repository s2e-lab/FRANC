def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	for version_dir in version_dirs:
		if not version_dir in self.version_dirs:
			version_re = re.compile(r'^[0-9]{2}')
			self.logger.error('%s: bad version path %s' % (self.name, version_dir))
			return False
		
		version_path = os.path.join(self.version_dirs[version_dir], self.version_file)
		version_filename, version_ext = os.path.splitext