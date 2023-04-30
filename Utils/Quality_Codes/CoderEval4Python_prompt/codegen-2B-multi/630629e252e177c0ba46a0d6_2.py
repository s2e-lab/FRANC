def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	
	# The first 3 values are the remote id, remote name and remote subdomain. This has to be overridden on the remote side.
	# This allows the use of a different document type id on the remote Diaspora host.
	meta = {
		'value': 'http://meta.diaspora.com/{}'.format(host),
		'title': 'Remote Diaspora host meta',
		'document_type': '{}_meta'.format(host),
		'content_type':'meta',
		'released': {
			'