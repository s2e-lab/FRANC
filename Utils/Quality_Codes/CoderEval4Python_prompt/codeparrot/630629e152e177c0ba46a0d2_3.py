def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	

	def __get_diaspora_webfinger(handle, handle_id=None):
		"""
		Retrieve a Diaspora webfinger document.
	
		:arg handle: Remote handle to retrieve
		:returns: dict
		"""
		if handle_id:
			handle_id = str(handle_id)
		else:
			# We're done here if we want the handle_id to be a string
			# instead of a list
			if isinstance(handle, basestring):
				handle = [handle]
		if isinstance(handle