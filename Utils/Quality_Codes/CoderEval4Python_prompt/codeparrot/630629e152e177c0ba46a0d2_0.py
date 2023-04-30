def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	
	
	doc = xml.dom.minidom.parse(handle)
	return document_to_dict(doc=doc)
	