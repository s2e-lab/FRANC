def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	inven_list = dict()
	inven_list_duplicates = set()
	for version in version_dirs:
		inventory_dir = "%s/%s.%s/inventory2.yaml" % (version, version, version)
		if not os.path.isfile(inventory_dir):
			inventory_dir = "%s/%s.%s/inventory1.yaml" % (version, version, version)
		inventory_file = "%s/inventory.yaml" % inventory_dir
		if not os.path