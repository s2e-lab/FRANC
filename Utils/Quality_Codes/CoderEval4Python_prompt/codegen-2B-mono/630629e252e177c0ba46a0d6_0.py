def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	from. import __version__
	from.exceptions import APIError
	from.host import Host
	from._util import host_url, urljoin
	if not isinstance(host, Host):
		host = Host.from_arg(host)
	if host.is_remote:
		return host.retrieve_diaspora_meta(True,
			'{}/{}/remote/{}/meta'.format(host_url, __version__, host.version),
			'{}/{}/remote/{}/meta'.