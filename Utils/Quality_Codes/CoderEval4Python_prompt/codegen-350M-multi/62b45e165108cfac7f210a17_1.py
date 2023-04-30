def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	logical_path_in_state = {}
	for name, version in version.items():
		for item in version:
			logical_path_in_state[item.name] = set(item.files)
	return logical_path_in_state
	
# ----------------------------------------------------------------------
