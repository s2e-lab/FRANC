def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	return api.get_remote_api(
			api.get_instance(__name__, "diaspora.retrieve_diaspora_host_meta")
			).reply(host.identifier)[0]
	