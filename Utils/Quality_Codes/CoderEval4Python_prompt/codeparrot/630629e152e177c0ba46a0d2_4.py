def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	

		
	parse_diaspora_webfinger = {}
	try:
		parse_diaspora_webfinger = handle.retrieve(parse_diaspora_webfinger_url)
	except ValueError:
		pass
			
	for k, v in parse_diaspora_webfinger.items():
		parse_diaspora_webfinger[k.replace(" ", "_")] = v.text


#
#   Process a directory listing recursively.
#
