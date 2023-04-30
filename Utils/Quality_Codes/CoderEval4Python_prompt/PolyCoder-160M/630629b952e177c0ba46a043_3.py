def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	d1, d2 = downloads.downloads(url,
		download_protocol='https',
		download_url=dict(scheme=dict(action='*'),
				version='1.1', base_url='https://example.com',
					download_id=dict(id='c4e6ef7fa1af1f2dd4f9e39e5dd24b5b2b4c'),
					source_url='https://example.com/foo/bar/baz/<int_key>',
					content_