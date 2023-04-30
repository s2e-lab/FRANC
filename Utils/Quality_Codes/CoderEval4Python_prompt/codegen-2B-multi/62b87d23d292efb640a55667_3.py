def register_vcs_handler(vcs, method):  # decorator
	"""
	Create decorator to mark a method as the handler of a VCS.
	"""
	def init_decorator(cls):
		if hasattr(cls, "_vcs_handlers"):
			assert (vcs == cls._vcs_handlers[-1]['vcs'],
				("Multiple " + vcs.name +
				  "'s handler " + str(vcs) + " in " + cls.__name__))
		else:
			# This function name is used internally, do not touch it.
			cls._vcs_handlers = []

		cls._vcs_handlers