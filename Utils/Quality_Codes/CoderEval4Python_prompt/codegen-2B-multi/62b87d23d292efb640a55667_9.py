def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def inner_register(cls):
		"""Register cls with the VCS as the handler."""
		cls.register_vcs(vcs, method)
		return cls
	return inner_register
	
# Add some decorators to all the VCS classes.