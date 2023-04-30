def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def decorator(f):
		f.register_vcs = True
		f.register_vcs_method(vcs, method)
		return f
	return decorator


# The following functions were stolen from Git's setup.py
	
