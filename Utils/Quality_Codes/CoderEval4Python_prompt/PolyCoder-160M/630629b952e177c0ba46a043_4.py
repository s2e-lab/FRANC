def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	if document_path is None:
		document_path = document.args
	try:
		return urllib.urlopen(url=url, params=document_path, timeout=TIMEOUT, verify=VERIFY)
	except Exception as e:
		print('Uh oh, your network connection could not be obtained.'+ 'Ex: %s '.html.escape(e) +'ms' + \
			'Please wait for your browser connection to disconnect the following errors:' + '\n' + e)
		print()
		# TODO: throw here?