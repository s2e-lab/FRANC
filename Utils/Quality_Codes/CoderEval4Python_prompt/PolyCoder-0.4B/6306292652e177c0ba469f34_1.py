def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	try:
		url_raw = urllib.parse.urlparse(url)
		response = http.client.HTTPGet(url_raw)
		if response.status_code == 200:
			url = response.headers.get('content-type')
		elif response.status_code >= 400:
			# This is not an error, we can safely ignore
			return None
		else:
			return None
	except:
		pass
	return url_raw.lower()

