def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	result = {'host-meta': [{'version': '1.1.0', 'doc-type': 'diaspora', 'doc-id': host['meta-id']}]}
	return result
	