def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	if not isinstance(host, Host):
		host = Host.of(host)
	
	return Metadata.retrieve_by_host(host).as_xrd()

