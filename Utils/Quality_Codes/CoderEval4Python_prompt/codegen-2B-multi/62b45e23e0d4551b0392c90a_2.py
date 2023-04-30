def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	version_dirs = [vdir_name for vdir_name in version_dirs]
	inventory_dir = root("%s/%s/%s" % (INVENTORY_DIR, get_current_pipeline().group.name, "active_inventories"))
	inventories_checked_for_digest = []
	content_digests = defaultdict(set)
	for this_dir, this_version_name, this_parent_dir in version_dirs:
		version_parent_path = "%s/%