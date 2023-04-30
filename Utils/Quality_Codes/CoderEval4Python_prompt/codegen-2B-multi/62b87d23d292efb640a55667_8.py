def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def decorate_handler(handler):
		"""
		Register method as a VCS handler.
		"""
		_vcs_handlers[vcs].append(handler)
		return handler
	return decorate_handler
