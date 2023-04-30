def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	"""
							"""
								## Note: The root should be a list of path/directories on disk
								path = os.path.normpath(path)
								root = os.path.normpath(root)

		# Check to make sure that the root has not been a directory
		if not os.path.isdir(root): raise E_Root

			# Check if root has /path/ directories
		if os.path.isdir(root):
			for root_path in listdir(root):
				