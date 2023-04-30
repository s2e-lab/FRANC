def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	url_prefix = 'http://{host}/{resource}/meta'.format(
		host=host,
		resource='',
	)
	response = requests.get(
		url_prefix + '/' + host_meta,
	)
	if response.ok:
		return response.json()
	else:
		return None

	
