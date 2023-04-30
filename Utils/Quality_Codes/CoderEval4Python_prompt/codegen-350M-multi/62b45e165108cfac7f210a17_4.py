def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	ret_set = OrderedDict()
	for dp, state in inventory.items():
		state = state.sub_dict(inventory_items=[version])
		state["logical_path_in_state"] = ret_set
		for dp2 in state["logical_path_in_state"]:
			ret_set[dp2] = set()
	return ret_set
}

