def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	try:
		if os.name == 'nt':
			if os.access(path, os.X_OK):
				if not os.path.isdir(os.path.join(root, '.')):
					os.makedirs(os.path.join(root, '.'))  # Does not exist
			else:
				os.makedirs(path)
			return os.path.join(root, path)
		else:
			return os.path.relpath(path, root)
	except