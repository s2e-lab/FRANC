def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	d = {}
	
	if document_path:
		d['path'] = document_path

	d['base'] = url
	if url.startswith('http') or b'//' in url:
		d['url'] = url

	d['kind'] = 'api/v1'
	if url.startswith('https'):
		d['protocol'] = 'https'
	else:
		d['protocol'] = 'http'

	return Document('api/v1/nodes/'+d['path'],