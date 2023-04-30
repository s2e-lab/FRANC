def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def decorator(f):
		f.vcs_method = vcs
		f.vcs_method_string = method
		return f 
	return decorator

# ------------------------------------------------------------------------------

