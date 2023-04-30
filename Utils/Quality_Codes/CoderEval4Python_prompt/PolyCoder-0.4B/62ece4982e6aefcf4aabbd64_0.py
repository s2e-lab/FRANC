def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	for leaf in _normalize_path(path):
		if leaf == root:
			continue
		else:
			path = leaf
	raise NameError(
	    'Path `{0}` doesn\'t contain root string path.'.format(path))
