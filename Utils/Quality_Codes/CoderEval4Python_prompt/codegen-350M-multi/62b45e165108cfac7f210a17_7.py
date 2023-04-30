def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	
	logical_path_in_state = {}
	
	for (v, m) in version.logical_path_map.items():
		content_files = m.get({"version": version})
		logical_path_in_state[v] = set([f for f, s3 in content_files.items() if log_path_in_s3(f, inventory, version)])
	
	return logical_path_in_state
	

