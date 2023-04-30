def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	versions_dirs = [self.repo_name] + version_dirs
	
	for vdir in versions_dirs:
		inventory_contents = FileContents("%s/inventory/%s" % (vdir, self.repo_name))
		version_inventory_dict = dict(inventory_contents.fileContents())
		root_inv = version_inventory_dict.get(vdir)
		valid_version_dir_paths = list()
		for path in inv.REV.get_paths_in_tree(