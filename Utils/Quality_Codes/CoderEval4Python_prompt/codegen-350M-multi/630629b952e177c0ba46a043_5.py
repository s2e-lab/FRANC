def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	full_url = urlparse(url).netloc
	scheme, domain, path, query, fragment = parse_nodeinfo_uri(full_url)
	
	# Use document_path if provided.
	document_path = document_path
	
	if document_path and document_path[-1] == '/':
		if full_url.count('/') > 1:
			document_path = document_path[-2:]
		else:
			document_path = ''
			
	# We're going to be writing our own document.