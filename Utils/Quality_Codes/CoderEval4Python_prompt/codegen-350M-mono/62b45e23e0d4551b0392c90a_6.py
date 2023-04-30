def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	# Verify that all versions in this root-inventory file have
	# a valid inventory root. 
	for root_version_dir, inventory_version_dir in version_dirs:
		path = os.path.join(root_version_dir, inventory_version_dir)
		version_dirs.append((path, root_version_dir)) # Make sure to not overwrite any existing versions

	# Verify that all versions in this root-inventory have a valid inventory root.
	for version_dir in version_dirs:
		inventory_version_dir, inventory