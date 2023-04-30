def strip_root(path, root):
	"""
	Remove root from path, throw exception on failure.
	"""
	try:
		# this is the most efficient way to handle Windows hosts without
		# /root and windows users without /bin/true
		# http://stackoverflow.com/questions/14550611/win-does-not-work-with-dir-symlink
		# if there is no /, then this will return False
		cmd = ('/bin/true' if root.upper() == 'C' else
			'/bin/false' if root.upper() == 'CP' else
			'/root' if root.upper() == '