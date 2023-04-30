def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	
    	if handle not in DOCS:
			return
				
		if re.search(r'Diploma$', handle):
			d = DOCS[handle].extract_contents()
			return d
		
	# If we are supposed to retrieve content from it on the front page
	if doctypespaces.PREFUSCATED in DOCS:
		d = DOCS[doctypespaces.PREFUSCATED].extract_contents()
		return d if d else {}
	
	# Else we have a document
	return {'document': DiasporaFileWrapper(