def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	result = {}
	for version_num in sorted(version.get('versions', {}).keys()):
		for (path, value_num) in version.get('versions', {}).iteritems():
			state = version.get('states', {})[path]
			if revision_num:
				version = revision_num
			logical_path = Inventory.get_logical_path(inventory, version, path)
			ref_file_num = list(set([x for x in state.get('refs', [])
				if x.path == ref