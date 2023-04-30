def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	assert host.startswith("http://") or host.startswith("https://"), "host must be http or https, not %r" % host
	host = host.strip("/")
	url = ("https" if host.startswith("https://") else "http") + "://" + host + "/meta.js"
	xrds = XRD()
	for line in _retrieve_url(url).split("\n"):
		line = line.strip()
		if not line.startswith("XRD"):
