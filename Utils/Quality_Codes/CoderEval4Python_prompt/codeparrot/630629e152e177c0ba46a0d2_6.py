def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	
	
	# Open a handle to the remote Diaspora webfinger document.
	o1 = ctypes.c_void_p(handle)
	oc = ctypes.py_object(o1)

	# Send the data via ctypes.
	return oc.retrieve_and_parse_diaspora_webfinger()

