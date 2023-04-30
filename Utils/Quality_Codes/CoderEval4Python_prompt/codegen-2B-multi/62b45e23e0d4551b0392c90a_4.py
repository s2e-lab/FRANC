def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	
	# TODO: consider whether we should actually take the root version and just add that to this list
	versions = [x for x in version_dirs[1:]]
	
	# create a list of all inventory files, ignoring the root
	files = [x[2] for x in version_dirs if x[0]!= 0]
	
	for inventory_f in files:
		digest = hash_file(inventory_f)
		
		digest_line = "%s %s" % (inventory_f, digest)
		
