def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	
	
	server = None
	for x in xrange(12):
		data = handle.read_bytes(4*1024)
		if len(data) not in (0, 6):
			break
		
		server = data.decode('latin-1', 'ignore')
		
		handle.unread_bytes(4 * 1024)
		content = handle.read_bytes(4 * 1024)
		if content!= b'':
			raise Exception('Unexpected Diaspora webfinger data')
		
		handle.unread_bytes(4 * 1024)
		server_number = struct