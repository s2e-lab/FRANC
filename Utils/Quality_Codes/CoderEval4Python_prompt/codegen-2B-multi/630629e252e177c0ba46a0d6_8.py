def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	with api.run("/hosts/{0}".format(host), method="GET") as xrd:
		return xrd.json

