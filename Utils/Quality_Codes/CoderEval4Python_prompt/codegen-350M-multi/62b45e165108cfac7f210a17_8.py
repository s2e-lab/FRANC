def get_logical_path_map(inventory, version):
	"""
	Get a map of logical paths in state to files on disk for version in inventory.
	
	Returns a dictionary: logical_path_in_state -> set(content_files)
	
	The set of content_files may includes references to duplicate files in
	later versions than the version being described.
	"""
	state = inventory.get_inventory(version)
	files = set(entry.get_logical_path()
				for entry in state.all_entries)
	
	return {k: set(v) for k, v in state.all_files.iteritems()
				if k.startswith((
					"{}-v{}".format(version.encode("latin-1"), str(k.replace('-', '_')).replace("-", "_")),
				)))
			}
	
#	except Exception, err