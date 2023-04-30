def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	args = {
		'url': url,
		'document_path': document_path,
	}
	if document_path:
		args['document_path'] = document_path
	return _extract_nodeinfo(args_to_nodeinfo(args))

