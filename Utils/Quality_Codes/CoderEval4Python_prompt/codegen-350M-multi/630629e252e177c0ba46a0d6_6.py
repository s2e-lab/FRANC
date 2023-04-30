def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	try:
		with DiasporaConnection(diaspora_host=host.get('url'), debug=True, timeout=30) as connection:
			return connection.document('get-by-diaspora-id', '__diaspora__')
	except:
		return None
