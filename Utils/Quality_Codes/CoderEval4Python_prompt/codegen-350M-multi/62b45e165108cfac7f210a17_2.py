def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	logically_in_state = set()	# This maps file system paths to the set of content files.
	file_system_file_mappings = {} # Contains a single value in the set of content files, if it has an inode
	file_system_file_mappings[""] = copy.deepcopy(set()	# Add "self" to the set to indicate that there is no file_system
	                         # mapping for that file system path as well as any children.
	                         # Set up the file_system file mapping, if specified by the users.
	