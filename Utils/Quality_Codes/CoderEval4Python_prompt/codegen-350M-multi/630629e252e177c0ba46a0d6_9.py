def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	doc = {}
	try:
		resp, body = pika.connect('pika:'+host)
		c = resp.channel()
		if c.curl_version < (1, 6, 12, 0):
			return False
		c.open_accept(resp, body)
		queue = nxrpc.Queue(body[0].decode("utf-8"))
		c.basic_qos(prefered=c.S(2))
		c.basic_qos(prefered=c.S(0))
