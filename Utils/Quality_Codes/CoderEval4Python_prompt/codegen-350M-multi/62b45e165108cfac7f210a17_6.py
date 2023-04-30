def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	logical_path_map = {};
	
	logical_path_map["/"] = set([])
	for item in inventory.root_dir:
		if item.is_file:
			logical_path_map[item.path] = set([])
	
	files = set()
	for item in inventory.root_dir:
		if item.is_file:
			files.add(item.path)
	
	for path, items in logical_path_map.items():
		for item in items:
			assert