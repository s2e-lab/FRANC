def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	import requests
		
	meta_url = "https://diaspora.com/{0}/about".format(host)
	headers = {
		"User-Agent": ("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 "
									"Safari/537.36")
	}

	r = requests.get(meta_url, headers=headers, verify=False)
	r.raise_for_status