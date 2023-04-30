def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	def fetch(url):
		r = requests.get(url)
		return r.json()
	
	host_meta = fetch('http://{}/meta/v1/'.format(host))
	return HostMeta.from_dic(host_meta)
	
	
