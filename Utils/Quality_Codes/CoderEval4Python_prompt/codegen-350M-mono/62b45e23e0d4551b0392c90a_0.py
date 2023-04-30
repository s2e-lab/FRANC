def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.
	
	Also keep a record of any content digests different from those in the root inventory
	so that we can also check them when validating the content.
	
	version_dirs is an array of version directory names and is assumed to be in
	version sequence (1, 2, 3...).
	"""
	assert 0 < len(version_dirs) <= 12
	for d in version_dirs:
		
		myrepo = None
		
		cur_version = d['version'].split('.')
		last_dot = -1
		for i, d in enumerate(version_dirs):
			version = d['version']
			if i == len(version_dirs) - 1:
				continue
			dot = (int(version) - int(last_dot)) % (len(cur_version) - 1)
			
			