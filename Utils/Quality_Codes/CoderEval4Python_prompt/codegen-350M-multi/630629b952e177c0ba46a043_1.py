def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	url = url2url(url)
	doc = ''
	if document_path:
		try:
			doc = os.path.join(document_path,
				nodeinfo.defaultDocDir, nodeinfo.defaultNodeDocName,
				nodeinfo.defaultNodeDocFile)
		except:
			pass
	doc = nodeinfo.create_file(url, doc, dt, nodeinfo.defaultDocDir)
	doc = doc.replace('&lt;', '<')  # remove unescaped <
	doc = unescape(doc)