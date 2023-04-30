def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	if url is None:
		return
	full_path = url + "#well-known"
	return {
		"nodeinfo": {
			"url": url,
			"document_root_path": document_path,
			"version": "1"
		}
	}
