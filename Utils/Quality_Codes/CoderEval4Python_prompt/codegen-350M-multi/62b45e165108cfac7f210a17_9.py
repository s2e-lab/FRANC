def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	
	retdict = {}
	for root, dirs, files in os.walk(inventory):
		for file in list(files):
			logicalpath = root + '/' + file
			try:
				content = get_logical_path_set(file, version)
				if content not in retdict:
					retdict[content] = set()
				retdict[content].add(logicalpath)
			except:
				continue
	return retdict	


